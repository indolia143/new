<%-- 
    Document   : candidatelogin
    Created on : Apr 2, 2013, 4:34:16 PM
    Author     : indolia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>



<script type="text/javascript">
    function checkPassword(str)
    { var re = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])\w{4,}$/; return re.test(str); }
    function checkForm(form) {
        if(form.pass.value != "" && form.pass.value == form.pwd2.value)
        { if(!checkPassword(form.pass.value)) { alert("The password you have entered is not valid should contain atleast one\n\
small,capital latters &no.!");
                form.pass.focus(); return false; } }
        else
        { alert("Error: Please check that you've entered and confirmed your password!");
            form.pass.focus(); return false; } return true; }
</script>
<body bgcolor="#0FF654" bottommargin="6"><center>-:CANDIDATE LOGIN PAGE:-</center><BR><BR><br>
    <table align="center" border="2" >

        <tr> <form method="POST" action="candidatevalidate" onSubmit="return checkForm(this);">
            <tr><td>  Voter ID:<td><input type="text" name="id" /></td></td></tr>
           <tr>
       <td>Enter Password:<td> <input type="password" name="pass" maxlength="10"></td></td></tr>
        <tr> <td>confirm Password:<td> <input type="password" name="pwd2" maxlength="10"></td></td></tr>
     
     <tr><td> <input type="submit" value="login"></td><td><input type="reset" value="reset"/></td></tr> </form></tr></table>
 </body>