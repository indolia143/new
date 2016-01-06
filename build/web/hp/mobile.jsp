<%-- 
    Document   : mobile
    Created on : Apr 12, 2013, 4:00:20 PM
    Author     : kkyd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    
      
        <script type="text/javascript"  >
            
    function validateMobNo(str){
      alert("this is:"+str);
    var mobno2;
     var flag=false;
     var mlen= str.length;
     
     alert(str.substr(3,str.length-3));
     if(str.charAt(0)!='+' && mlen==10){
         alert("here");
         mobno2="+91-"+str;
         alert("1>>your mobile wants to be in "+mobno2);
         flag=true;
     }
     else if(str.charAt(0)=='+'){
         if(str.substr(0,3)=='+91' && str.length==13){
             mobno2=str.substr(0,3)+"-"+str.substr(3,str.length-3);
             alert("2>>your mobile wants to be in "+mobno2);
             flag=true;
         }
     }
     else if(str.indexOf("-")<0&&str.length==12 && str.substr(0,2)=='91'){
         mobno2=str.substr(0,2)+"-"+str.substr(3,str.length-2);
         alert("3>>your mobile wants to be in "+mobno2);
         flag=true;
         }
     else
         alert("Please correct your mobile No");
     if(flag==true)
        form.str.value=mobno2;
     else
        form.str.focus()
     return flag;

 }</script>
        
        <form method="POST" action="" onSubmit="return validateMobNo(mobno);">
         NO:   <input type="text" name="mobno">
         <input type="submit" />
        </form>
</html>
