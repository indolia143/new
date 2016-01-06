<script type="text/javascript">
    function checkPassword(str)
    { var re = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])\w{4,}$/; return re.test(str); }
    function checkForm(form) { if(form.username.value == "")
        { alert("Error: Username cannot be blank!");
            form.username.focus();
            return false; } re = /^\w+$/;
        if(!re.test(form.username.value))
        { alert("Error: Username must contain only letters, numbers and underscores!");
            form.username.focus(); return false; }
        if(form.passkey.value != "" && form.passkey.value == form.pwd2.value)
        { if(!checkPassword(form.passkey.value)) { alert("The password you have entered is not valid it must contain atleast\n\\n\
one character of each  uppercase,lowercase& number!");
                form.passkey.focus(); return false; } }
        else
        { alert("Error: Please check that you've entered and confirmed your password!");
            form.passkey.focus(); return false; } return true; }
</script><center>ADMINISTRATOR LOGIN TESTING PAGE</center>
<body bgcolor="#009FFF" bottommargin="6"><table align="center" bgcolor="lightgreen" border="2">

        <tr> <form method="POST" action="adminvalidate" onSubmit="return checkForm(this);">
            <tr><p><td>Administrator name:<td><input type="text" name="username"></td>
 </td>  </p></tr><tr><td>  Administrator ID:<td><input type="text" name="aid"/></td></td></tr><tr>
        <p> <td>Enter Password:<td> <input type="password" name="passkey"></td></td></p></tr>
        <tr> <p><td>confirm Password:<td> <input type="password" name="pwd2"></td></td></p></tr>   
        <tr><td> <p><input type="submit"></p></td><td><input type="reset" value="Reset"></td></tr> </form></tr></table>
</body>
 