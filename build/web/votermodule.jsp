<%-- 
    Document   : votermodule
    Created on : Jul 12, 2012, 11:21:09 AM
    Author     : indolia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html>
    <head>
      
    </head>
    <body bgcolor="#9FFFF8" border="3">
        
        <font color="blue">
     <center><h2>VOTER HOME </h2></center>
        </font>
 <table align="right" border="2">
     <tr><td><form action="action1.jsp" method="post">
         <%session.invalidate();%>
     <input type="submit" value="logout">
     </form>

         </td></tr></table><table align="left" bgcolor="#FFF8FF" border="2">
             <tr><td> <form action="updatevoter.jsp" >

            <input type="submit" name="update" value="UPDATE ACCOUNT">
        </form></td></tr></table>
        <table align="center" bgcolor="pink" border="2s" >
            <tr><td>
     <form action="candidateinfo.jsp" method="post">

            <input type="submit" name="viewcandi" value="CANDIDATE INFORMATION ">
     </form><td></tr></table>
     <table align="left" border="2" bgcolor="#01FF99"><tr><td>
        <form action="result.jsp" method="post">

            <input type="submit" name="result" value="ELECTION RESULT">
        </form></td></tr></table><br><br>
     <table align="left" border="2" bgcolor="#01FF99"><tr><td>
        <form action="askquestion.jsp" method="post">

            <input type="submit" name="ask" value="ASK QUESTION">
        </form></td></tr>
     </table><br><br><br>
        CLICK HERE FOR CAST THE VOTE : <a href="votinghomepage.jsp"> -> </a>
    </body>
</html>
