<%--
    Document   : votermodule
    Created on : Jul 12, 2012, 11:21:09 AM
    Author     : indolia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>

    </head>
    <body BGCOLOR="LIGHTGREEN">

        <font color="blue">
     <center><h2>CANDIDATE HOME </h2></center></hr>
        </font>
         <table align="right" bgcolor="lightred" border="2">
            <tr><td>
        <form action="action1.jsp" method="post">
            <input type="submit" value="LOGOUT">
        </form></tr></td></table>
 <table align="left" bgcolor="lightyellow" border="2">
            <tr><td>
        <form action="updatecandidate.jsp" >

            <input type="submit" name="update" value="UPDATE ACCOUNT">
            </td></tr></table>
        </form>
        <table align="center" bgcolor="lightsky" border="2">
            <tr><td>

        <form action="addandeditpromises.jsp" method="post">

            <input type="submit"  value="ADD and EDIT PROMISES">
        </form></td></tr></table>
                    <table align="lefr" bgcolor="lightyellow" border="2">
            <tr><td>
        <form action="answer" method="post">

            <input type="submit"  value="READ QUESTIONS"/></form></td></tr></table>
       
             <form action="giveanswer.jsp" method="post">

            <input type="submit"  value="ANSWER QUESTIONS"/></form>
       
                
    </body>
</html>
