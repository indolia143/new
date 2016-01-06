<%-- 
    Document   : votinghomepage
    Created on : Jul 15, 2012, 8:07:10 PM
    Author     : kkyd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html>
    <head>
    <hr>
    <marquee direction="right" ><h1>ONLINE VOTING HOME PAGE</h1></marquee>
    <hr>
</head>
<body>
<form action="votinglist.jsp" method="post">
    <table align="left" bgcolor="pink" border="2">
            <td>
                
                   LOGIN ID: <input type="text"name="vid"><br>
                   LOGIN PASSWORD:<input type="password" name="hashpass"><br>
                   <input type="submit" name="submit" value="SUBMIT"><br>
                <input type="reset" name="reset" value="RESET">
               
            </td>

        </table>
     </form>
    </body>
</html>
