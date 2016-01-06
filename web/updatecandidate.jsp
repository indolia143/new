<%--
    Document   : updatecandidate
    Created on : Jul 14, 2012, 10:52:08 PM
    Author     : kkyd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>



<script type="text/javascript">
    function checkPassword(str)
    { var re = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])\w{4,}$/; return re.test(str); }
    function checkForm(form) {
        if(form.newpass.value != "" && form.newpass.value == form.pwd3.value)
        { if(!checkPassword(form.pwd1.value)) { alert("The password you have entered is not valid!");
                form.newpass.focus(); return false; } }
        else
        { alert("Error: Please check that you've entered and confirmed your password!");
            form.pwd1.focus(); return false; } return true; }
</script>
<body bgcolor="#009999" bottommargin="6"><center>-:CANDIDATE UPDATE ACCOUNT PAGE:-</center>
 <form method="POST" action="updatecandidate" onSubmit="return checkForm(this);">
     <table align="center" bgcolor="lightgreen" border="2">
         <tr><td>  Voter ID:<td><input type="text" name="cid"/></td><br></td></tr>
         <tr><td> <p> old Password: <td><input type="password" name="oldpass" maxlength="10"></td></p><td></tr>
         <tr><td>  <p>new Password:<td> <input type="password" name="newpass"maxlength="10"></td></p></td></tr>
         <tr><td>  <p>Confirm Old Password: <td><input type="password" name="pwd3"maxlength="10"></td></p></td></tr>

         <tr><td> <p><input type="submit"></p></td><td><input type="reset" value="reset"/></td></tr></table> </form>
 </body>
