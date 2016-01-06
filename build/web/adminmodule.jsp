<%--
    Document   : adminmodule
    Created on : Jul 15, 2012, 7:51:07 AM
    Author     : kkyd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>

    <hr><marquee bgcolor="green"> <h1> ADMINISTRATOR HOME PAGE</h1></marquee><hr>
    </head>
<body bgcolor=" voilate">
        <table align="right" border="2">
            <tr><td>
            <form action="logout" method="post">
            <input type="submit" value="LOGOUT"/>
            </form></td></tr></table>
        <form action="pregistrationform.jsp" method="post">
                    <input type="submit" name="registration" value="PARTY REGISTRATION"/>
                    
        </form>
        <form action="fillvotingdetail.jsp" method="post">
            <input type="submit" name="voting" value="FILL VOTING DETAIL"/>
        </form>
    <form action="updateresult.jsp" method="post">
        <input type="submit" name="update" value="UPDATE VOTING RESULT">
    </form>
            <table align="center" bgcolor="green">
                <tr><td><hr>
        <a href="candidatemodule.jsp"><b>OPEN CANDIDATE ACCOUNT</b></a><hr>
                    </td></tr></table><br>
                    <table align="left" bgcolor="orange" border="2">
                <tr><td><hr>
        <a href="passforvoter.jsp"><b>GENERATE PASSWORD FOR VOTER</b></a><hr>
                    </td></tr></table><br><br><br><br><br>
<table align="left" bgcolor="creem">
                <tr><td><hr>
        <a href="passforcandidate.jsp"><b>GENERATE PASSWORD FOR CANDIDATE</b></a><hr>
</td></tr></table>



          </body>
</html>
