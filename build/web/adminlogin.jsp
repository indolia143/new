
<script type="text/javascript">
    function checkPassword(str)
    { var re = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])\w{4,}$/; return re.test(str); }
    function checkForm(form) {
        if(form.passkey.value != "" && form.passkey.value == form.pwd2.value)
        { if(!checkPassword(form.passkey.value)) { alert("The password you have entered is not valid it must contain atleast\n\\n\
one character of each  uppercase,lowercase& number!");
                form.passkey.focus(); return false; } }
        else
        { alert("Error: Please check that you've entered and confirmed your password!");
            form.pwd1.focus(); return false; } return true; }
</script><center>-:ADMINISTRATOR LOGIN  PAGE:-</center><br><br><br>
<body bgcolor="#009FFF" bottommargin="6"><table align="center" bgcolor="lightgreen" border="2">

        <tr> <form method="POST" action="adminvalidate" onSubmit="return checkForm(this);">
            <tr><td>  Administrator ID:<td><input type="text" name="aid"/></td></td></tr><tr>
        <p> <td>Enter Password:<td> <input type="password" name="passkey" maxlength="10"></td></td></p></tr>
        <tr> <p><td>confirm Password:<td> <input type="password" name="pwd2" maxlength="10"></td></td></p></tr>
        <tr><td> <input type="submit" value="login"></td><td><input type="reset" value="Reset"></td></tr> </form></tr></table>
</body>

