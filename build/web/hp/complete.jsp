<script type="text/javascript">
    function checkPassword(str)
    { var re = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])\w{6,}$/; return re.test(str); }
    function checkForm(form) { if(form.username.value == "")
        { alert("Error: Username cannot be blank!");
            form.username.focus();
            return false; } re = /^\w+$/;
        if(!re.test(form.username.value))
        { alert("Error: Username must contain only letters, numbers and underscores!");
            form.username.focus(); return false; }
        if(form.pwd1.value != "" && form.pwd2.value == form.pwd3.value)
        { if(!checkPassword(form.pwd1.value)) { alert("The password you have entered is not valid!");
                form.pwd1.focus(); return false; } }
        else
        { alert("Error: Please check that you've entered and confirmed your password!");
            form.pwd1.focus(); return false; } return true; }
</script> <form method="POST" action="voterupdate" onsubmit="return checkForm(this);">
    <p>Username: <input type="text" name="username"></p>
    <p> New Password: <input type="password" name="pwd1"></p>
    <p>Old Password: <input type="password" name="pwd2"></p>
      <p>Confirm Old Password: <input type="password" name="pwd3"></p>
       Voter ID:<input type="text" name="id"/><br>
    <p><input type="submit"></p> </form>
