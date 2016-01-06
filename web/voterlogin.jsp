
<script type="text/javascript">
    function checkPassword(str)
    { var re = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])\w{4,}$/; return re.test(str); }
    function checkForm(form) { 
        if(form.pass.value != "" && form.pass.value == form.pwd2.value)
        { if(!checkPassword(form.pass.value)) { alert("The password you have entered is not valid!");
                form.pass.focus(); return false; } }
        else
        { alert("Error: Please check that you've entered and confirmed your password!");
            form.pass.focus(); return false; } return true; }
</script>
<body bgcolor="#00FFFF" bottommargin="6"><center>-:VOTER LOGIN PAGE:-</center><br><br><br><br>
         <table align="center" bgcolor="lightgreen" border="2"><tr>
<form method="POST" action="votervalidate" onSubmit="return checkForm(this);">
    <tr><td>  Voter ID:<td><input type="text" name="id"/></td></td></tr>
             <tr>
        <p> <td>Enter Password:<td> <input type="password" name="pass" maxlength="10" requiredplaceholder="pass should contain
                                           atleast one small,capital latter& no "></td></td></p></tr>
        <tr> <p><td>confirm Password:<td> <input type="password" name="pwd2" maxlength="10"></td></td></p></tr>
     
     <tr><td> <p><input type="submit" value="login"></p></td><td><input type="reset" value="reset"/></td></tr> </form></tr></table>
 </body>