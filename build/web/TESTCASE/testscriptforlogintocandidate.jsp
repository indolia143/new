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
        if(form.pass.value != "" && form.pass.value == form.pwd2.value)
        { if(!checkPassword(form.pass.value)) { alert("The password you have entered is not valid!");
                form.pass.focus(); return false; } }
        else
        { alert("Error: Please check that you've entered and confirmed your password!");
            form.pass.focus(); return false; } return true; }
</script>
<body bgcolor="#009FFF" bottommargin="6"><table align="center" bgcolor="lightgreen" border="2">

        <tr> <form method="POST" action="candidatevalidate" onSubmit="return checkForm(this);">
            <tr><p><td>Username:<td><input type="text" name="username"></td>
 </td>  </p></tr><tr>
        <p> <td>Enter Password:<td> <input type="password" name="pass"></td></td></p></tr>
        <tr> <p><td>confirm Password:<td> <input type="password" name="pwd2"></td></td></p></tr>
     <tr><td>  Voter ID:<td><input type="text" name="id"/></td></td></tr>
     <tr><td> <p><input type="submit"></p></td></tr> </form></tr></table>
 </body>