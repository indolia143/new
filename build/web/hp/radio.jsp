
<SCRIPT LANGUAGE="JAVASCRIPT">
     
function RadioValidator()
{
   
    var ShowAlert = '';
    var AllFormElements = window.document.getElementById("FormID").elements;
    for (i = 0; i < AllFormElements.length; i++)
    {
        if (AllFormElements[i].type == 'radio')
        {
            var ThisRadio = AllFormElements[i].name;
            var ThisChecked = 'No';
            var AllRadioOptions = document.getElementsByName(ThisRadio);
            for (x = 0; x < AllRadioOptions.length; x++)
            {
                 if (AllRadioOptions[x].checked && ThisChecked == 'No')
                 {
                     ThisChecked = 'Yes';
                     break;
                 }
            }
            var AlreadySearched = ShowAlert.indexOf(ThisRadio);
            if (ThisChecked == 'No' && AlreadySearched == -1)
            {
            ShowAlert = ShowAlert + ThisRadio + ' radio button must be answered\n';
            }
        }
    }
    if (ShowAlert != '')
    {
    alert(ShowAlert);
    return false;
    }
    else
    {
    return true;
    }
}
</SCRIPT>
<form id="FormID" >

    Yes <input type="radio" name="test1" value="Yes">
    No <input type="radio" name="test1" value="No">

    <br><br>

    Yes <input type="radio" name="test2" value="Yes">
    No <input type="radio" name="test2" value="No">

   <input type="submit" onclick="RadioValidator();">
</form>