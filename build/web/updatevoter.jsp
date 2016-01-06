<html>
  
<script type="text/javascript">
    function checkPassword(str)
    { var re = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])\w{4,}$/; return re.test(str); }
    function checkForm(form) {
        if(form.newpass.value != "" && form.newpass.value == form.pwd3.value)
        { if(!checkPassword(form.newpass.value)) { alert("The password you have entered is not valid!");
                form.newpass.focus(); return false; } }
        else
        { alert("Error: Please check that you've entered and confirmed your password!");
            form.pwd1.focus(); return false; } return true; }
</script>
<body bgcolor="#009999" bottommargin="6"><center>-:VOTER UPDATE ACCOUNT PAGE:-</center>
 <form method="POST" action="voterupdate" onSubmit="return checkForm(this);">
     <table align="center" bgcolor="lightgreen" border="2">
        <tr><td>  Voter ID:<td><input type="text" name="id"/></td><br></td></tr>
         <tr><td> <p> old Password: <td><input type="password" name="oldpass" maxlength="10"></td></p><td></tr>
         <tr><td>  <p>new Password:<td> <input type="password" name="newpass" maxlength="10"></td></p></td></tr>
         <tr><td>  <p>Confirm new Password: <td><input type="password" name="pwd3"maxlength="10"></td></p></td></tr>

         <tr><td> <p><input type="submit" value="update"></p></td><td><input type="reset" value="reset"/></td></tr></table> </form>
 </body>