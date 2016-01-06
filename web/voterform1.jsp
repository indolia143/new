
<html>
    <script type="text/javascript">
        function checkEmail(str)
        {
            var rs=/^\w+([\.-]?\w+)*&\w+([\.-]?\w+)*(\.\w{2,3})+$/;return rs.test(str);
        }
    function checkPassword(str)
    { var re = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])\w{4,}$/; return re.test(str); }
    function checkForm(form) { if(form.fname.value == "")
        { alert("Error: First name field cannot be blank!");
            form.fname.focus();
            return false; } re = /^\w+$/;
        if(!re.test(form.fname.value))
        { alert("Error: first name field must contain only letters, numbers and underscores!");
            form.fname.focus(); return false; }
        if(form.lname.value == "")
        { alert("Error: lanme cannot be blank!");
            form.lname.focus();
            return false; } re = /^\w+$/;
        if(!re.test(form.lname.value))
        { alert("Error: lname field must contain only letters, numbers and underscores!");
            form.lname.focus(); return false; }
        if(form.faname.value == "")
        { alert("Error: Father name field cannot be blank!");
            form.faname.focus();
            return false; } re = /^\w+$/;
        if(!re.test(form.faname.value))
        { alert("Error: Father name field must contain only letters, numbers and underscores!");
            form.faname.focus(); return false; }
        if(form.address.value == "")
        { alert("Error: address field name field cannot be blank!");
            form.address.focus();
            return false; } re = /^\w+$/;
        if(!re.test(form.adddress.value))
        { alert("Error: address field must contain only letters, numbers and underscores!");
            form.address.focus(); return false; }

        if(form.mobno.value == "")
        { alert("Error: mobileno  field cannot be blank!");
            form.mobno.focus();
            return false; } re = /^[0-9]+$/;
        if(!re.test(form.mobno.value))
        { alert("Error: mobileno field must contain only integer  digits!");
            form.mobno.focus(); return false; }

       if(form.email.value == "")
        { alert("Error: Email field name field cannot be blank!");
            form.email.focus();
            return false; } re = /^\w+([\.-]?\w+)*&\w+([\.-]?\w+)*(\.\w{2,3})+$/;
        if(!re.test(form.email.value))
        { alert("Error: Email field must contain & and should into the proper formate!");
            form.email.focus(); return false; }

        if(form.pass.value != "" && form.pass.value == form.pwd2.value)
        { if(!checkPassword(form.pass.value)) { alert("The password you have entered is not valid it must contain atleast\n\
one capital,small latter&integer number!");
                form.pass.focus(); return false; } }
        else
        { alert("Error: Please check that you've entered and confirmed your password!");
            form.pass.focus(); return false; } return true; }
</script>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body BGCOLOR="silver">
    <form method="POST" action="voter" onSubmit="return checkForm(this);">
     <font color="green">
        <center><h2><u>VOTER  REGISTRATION FORM</u></h2></center><BR>
            <h4>please fill correct information in the fields:</h4>
    </font>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td width="17" height="22">&nbsp;</td>
    <td width="71">&nbsp;</td>
    <td width="17">&nbsp;</td>
    <td width="57">&nbsp;</td>
    <td width="100">&nbsp;</td>
    <td width="46">&nbsp;</td>
    <td width="5">&nbsp;</td>
    <td width="88">&nbsp;</td>
    <td width="26">&nbsp;</td>
    <td width="100">&nbsp;</td>
    <td width="24">&nbsp;</td>
    <td width="28">&nbsp;</td>
    <td width="93">&nbsp;</td>
    <td width="44">&nbsp;</td>
    <td width="82">&nbsp;</td>
    <td width="47">&nbsp;</td>
    <td width="45">&nbsp;</td>
    <td width="32">&nbsp;</td>
    <td width="100%">&nbsp;</td>
  </tr>
  <tr>
    <td height="43"></td>
    <td colspan="3" rowspan="3" valign="top">FIRST NAME: </td>
    <td colspan="2" rowspan="3" valign="top">
      <label>
        <input type="text" name="fname" />
        </label>    </td>
    <td colspan="2" valign="top">LAST NAME: </td>
    <td colspan="3" valign="top">
      <label>
        <input type="text" name="lname" />
        </label>                                        </td>
    <td></td>
    <td></td>
    <td colspan="4" valign="top">
      <label>IMAGE:
        <input name="imagepath" type="file" id="BROWSER" />
        </label>     </td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="3"></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="13"></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td rowspan="5" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
        <td width="225" height="129">&nbsp;</td>
        </tr>
      <tr>
        <td height="1"><img src="../../Public/Pictures/Sample Pictures/Hydrangeas.jpg" alt="" width="154" height="1" /></td>
        </tr>
    </table></td>
  </tr>






  <tr>
    <td height="57"></td>
    <td colspan="3" valign="top">DATE OF BIRTH :</td>
    <td colspan="3" valign="top">
      <label>
       <select name="month" onchange="return wait_for_load(this, event, function() { editor_date_month_change(this, 'birthday_day','birthday_year'); });">
<option value="na">Month</option>
<option value="1">January</option>
<option value="2">February</option>
<option value="3">March</option>
<option value="4">April</option>
<option value="5">May</option>
<option value="6">June</option>
<option value="7">July</option>
<option value="8">August</option>
<option value="9">September</option>
<option value="10">October</option>
<option value="11">November</option>
<option value="12">December</option>
</select>

<select name="day">
<option value="na">Day</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="13">13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16</option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21">21</option>
<option value="22">22</option>
<option value="23">23</option>
<option value="24">24</option>
<option value="25">25</option>
<option value="26">26</option>
<option value="27">27</option>
<option value="28">28</option>
<option value="29">29</option>
<option value="30">30</option>
<option value="31">31</option>
</select>
<select name="year">
<option value="na">Year</option>
<option value="2009">2009</option>
<option value="2008">2008</option>
<option value="2007">2007</option>
<option value="2006">2006</option>
<option value="2005">2005</option>
<option value="2004">2004</option>
<option value="2003">2003</option>
<option value="2002">2002</option>
<option value="2001">2001</option>
<option value="2000">2000</option>
<option value="1999">1999</option>
<option value="1998">1998</option>
<option value="1997">1997</option>
<option value="1996">1996</option>
<option value="1995">1995</option>
<option value="1994">1994</option>
<option value="1993">1993</option>
<option value="1992">1992</option>
<option value="1991">1991</option>
<option value="1990">1990</option>
<option value="1989">1989</option>
<option value="1988">1988</option>
<option value="1987">1987</option>
<option value="1986">1986</option>
<option value="1985">1985</option>
<option value="1984">1984</option>
<option value="1983">1983</option>
<option value="1982">1982</option>
<option value="1981">1981</option>
<option value="1980">1980</option>
<option value="1979">1979</option>
<option value="1978">1978</option>
<option value="1977">1977</option>
<option value="1976">1976</option>
<option value="1975">1975</option>
<option value="1974">1974</option>
<option value="1973">1973</option>
<option value="1972">1972</option>
<option value="1971">1971</option>
<option value="1970">1970</option>
<option value="1969">1969</option>
<option value="1968">1968</option>
<option value="1967">1967</option>
<option value="1966">1966</option>
<option value="1965">1965</option>
<option value="1964">1964</option>
<option value="1963">1963</option>
<option value="1962">1962</option>
<option value="1961">1961</option>
<option value="1960">1960</option>
<option value="1959">1959</option>
<option value="1958">1958</option>
<option value="1957">1957</option>
<option value="1956">1956</option>
<option value="1955">1955</option>
<option value="1954">1954</option>
<option value="1953">1953</option>
<option value="1952">1952</option>
<option value="1951">1951</option>
<option value="1950">1950</option>
<option value="1949">1949</option>
<option value="1948">1948</option>
<option value="1947">1947</option>
<option value="1946">1946</option>
<option value="1945">1945</option>
<option value="1944">1944</option>
<option value="1943">1943</option>
<option value="1942">1942</option>
<option value="1941">1941</option>
<option value="1940">1940</option>
<option value="1939">1939</option>
<option value="1938">1938</option>
<option value="1937">1937</option>
<option value="1936">1936</option>
<option value="1935">1935</option>
<option value="1934">1934</option>
<option value="1933">1933</option>
<option value="1932">1932</option>
<option value="1931">1931</option>
<option value="1930">1930</option>
<option value="1929">1929</option>
<option value="1928">1928</option>
<option value="1927">1927</option>
<option value="1926">1926</option>
<option value="1925">1925</option>
<option value="1924">1924</option>
<option value="1923">1923</option>
<option value="1922">1922</option>
<option value="1921">1921</option>
<option value="1920">1920</option>
<option value="1919">1919</option>
<option value="1918">1918</option>
<option value="1917">1917</option>
<option value="1916">1916</option>
<option value="1915">1915</option>
<option value="1914">1914</option>
<option value="1913">1913</option>
<option value="1912">1912</option>
<option value="1911">1911</option>
<option value="1910">1910</option>
<option value="1909">1909</option>
</select>

        </label>    </td>
    <td colspan="5" valign="top">PRESS ANY KEY IN DIGITS(0-9):</td>
    <td colspan="3" valign="top">
      <label>
        <input type="password" name="hashpass" maxlength="1" />
      </label>    </td>
  </tr>
  <tr>
    <td height="27"></td>
    <td colspan="3" valign="top">FATHER'S NAME: </td>
    <td colspan="2" valign="top">
      <label>
        <input type="text" name="faname" />
        </label>    </td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>

  <tr>
    <td height="26"></td>
    <td colspan="3" valign="top">EMAIL ID: </td>
    <td colspan="2" valign="top">
      <label>
       <input type="text" name="email" pattern="^\w+([.-]?\w+)*@\w+([.-]?\w+)*(.\w{2,3})+$" required placeholder="Enter a valid email address"/>
      </label>   </td>
    </tr><tr>
    <td colspan="3" valign="top">PASSWORD:</td>
    <td colspan="2" valign="top"><label>
            <input type="password" name="pass" maxlength="10" />
    </label></td>
    <td colspan="3" valign="top">CONFIRM PASSWORD:</td>
    <td colspan="2" valign="top"><label>
            <input type="password" name="pwd2" maxlength="10" />
    </label></td>

  </tr>
  <tr>
    <td height="26"></td>
    <td colspan="3" rowspan="2" valign="top">PERMANENT ADD: </td>
    <td colspan="2" rowspan="2" valign="top">
      <label>
        <input type="text" name="address" />
        </label>   </td>
    <td colspan="2" rowspan="2" valign="top"></td>
    <td colspan="3" rowspan="2" valign="top">
      <label>        </label>       </td>
    <td>&nbsp;</td>
    <td valign="top"> </td>
    <td colspan="3" valign="top">
      <label>        </label>    </td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="15"></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>

  <tr>
    <td height="21"></td>
    <td colspan="3" rowspan="2" valign="top">MOBNO: </td>
    <td colspan="2" rowspan="2" valign="top">
      <label></label><label>
          <input type="text" name="mobno" maxlength="10" />
        </label>        </td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="1"></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td rowspan="3" valign="top">STATUS:</td>
    <td colspan="2" rowspan="3" valign="top">
      <label>
        <select name="status">
          <option value="MARRIED">MARRIED</option>
          <option value="UNMARRIED">UNMARRIED</option>
        </select>
        </label>   </td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="2"></td>
    <td colspan="2" rowspan="3" valign="top">GENDER:</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>

    <td colspan="2" rowspan="2" nowrap="nowrap"><select name="category" id="GENERAL">
      <option value="GENERAL">GENERAL</option>
      <option value="OBC">OBC</option>
      <option value="SC/ST">SC/ST</option>
      <option value="OTHER">OTHER</option>
                            </select></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="21"></td>
    <td colspan="2" rowspan="3" valign="top"><label>
      <input type="radio" name="sex" value="MALE" />
      M    </label>
      <label><br />
      <input type="radio" name="sex" value="FEMALE" />
F </label></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
       <td valign="top">CATEGORY:</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="13"></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>



  <tr>
    <td height="11"></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>

  <tr>
    <td height="25"></td>
    <td rowspan="2" valign="top">
      <label></label></td>
    <td></td>
    <td rowspan="2" valign="top">
      <label></label>       </td>
    <td></td>
    <td></td>
    <td colspan="3" valign="top">USER TYPE: </td>
    <td valign="top"><label>
      <select name="usertype">
        <option value="VOTER">VOTER</option>
      </select>
    </label></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="18"></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="37"></td>
    <td rowspan="2" valign="top"><input type="submit" name="submit" value="SUBMIT" /></td>
    <td>&nbsp;</td>
    <td><input name="RESET" type="reset"  value="RESET" /></td>
    <td></td>

    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="25"></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="107"></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>


  <tr><td height="1"><img src="file:///spacer.gif" alt="" width="17" height="1" /></td><td><img src="file:///spacer.gif" alt="" width="71" height="1" /></td>
    <td><img src="file:///spacer.gif" alt="" width="17" height="1" /></td>
    <td><img src="file:///spacer.gif" alt="" width="57" height="1" /></td><td><img src="file:///spacer.gif" alt="" width="100" height="1" /></td>
    <td><img src="file:///spacer.gif" alt="" width="46" height="1" /></td>
    <td><img src="file:///spacer.gif" alt="" width="5" height="1" /></td>
    <td><img src="file:///spacer.gif" alt="" width="88" height="1" /></td>
    <td><img src="file:///spacer.gif" alt="" width="26" height="1" /></td>
    <td><img src="file:///spacer.gif" alt="" width="100" height="1" /></td>
    <td><img src="file:///spacer.gif" alt="" width="24" height="1" /></td><td><img src="file:///spacer.gif" alt="" width="28" height="1" /></td>
    <td><img src="file:///spacer.gif" alt="" width="93" height="1" /></td>
    <td><img src="file:///spacer.gif" alt="" width="44" height="1" /></td>
    <td><img src="file:///spacer.gif" alt="" width="82" height="1" /></td>
    <td><img src="file:///spacer.gif" alt="" width="47" height="1" /></td>
    <td><img src="file:///spacer.gif" alt="" width="45" height="1" /></td>
    <td><img src="file:///spacer.gif" alt="" width="32" height="1" /></td>
    <td></td>
  </tr>
</table>

  <p>
    <label></label>
    <label></label>
    <br />
  </p>

    </form>
</body>

</html>
