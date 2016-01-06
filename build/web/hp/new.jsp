<script>

//Double-enter form element script- by Jon Caws joncaws@btinternet.com
//Visit JavaScript Kit (http://www.javascriptkit.com) for script
//Credit must stay intact for use

var fieldalias="Email address field"

function verify(element1, element2){
var passed=false
if (element1.value==''){
alert("Please fill out the "+fieldalias+"!")
element1.focus()
}
else if (element2.value==''){
alert("Please verify the "+fieldalias+"!")
element2.focus()
}
else if (element1.value!=element2.value){
alert("The two "+fieldalias+"s do not match")
element1.select()
}
else
passed=true

return passed

}

</script>
<!--Replace "emailone" and "emailtwo" with name of the two associated fields-->
<form name=test onSubmit="return verify(this.emailone, this.emailtwo)">

Enter email: <input type="text" name="emailone"><br />
Re-Enter email:<input type="text" name="emailtwo"><br />

<input type="submit" value="submit">
</form>


<form onSubmit="return verify(this.emailone, this.emailtwo)">