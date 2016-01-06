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
        if(form.newpass.value != "" && form.newpass.value == form.pwd3.value)
        { if(!checkPassword(form.pwd1.value)) { alert("The password you have entered is not valid!");
                form.newpass.focus(); return false; } }
        else
        { alert("Error: Please check that you've entered and confirmed your password!");
            form.pwd1.focus(); return false; } return true; }
</script>
 <body bgcolor="#0099FF" bottommargin="6">
 <form method="POST" action="updatecandidate" onSubmit="return checkForm(this);">
     <table align="center" bgcolor="lightgreen" border="2">
         <tr><td><p>Username:<td><input type="text" name="username"></td>
             </p></td></tr><tr><td>  Candidate ID:<td><input type="text" name="cid"/></td><br></td></tr>
         <tr><td> <p> old Password: <td><input type="password" name="oldpass" maxlength="10"></td></p><td></tr>
         <tr><td>  <p>new Password:<td> <input type="password" name="newpass"maxlength="10"></td></p></td></tr>
         <tr><td>  <p>Confirm Old Password: <td><input type="password" name="pwd3"maxlength="10"></td></p></td></tr>
         
         <tr><td> <p><input type="submit"></p></td><td><input type="reset" value="reset"/></td></tr></table> </form>
 </body>