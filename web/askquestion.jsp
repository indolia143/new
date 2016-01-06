<%-- 
    Document   : askquestion
    Created on : Jul 15, 2012, 7:39:02 AM
    Author     : kkyd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html>
    <head>
        
        <title>JSP Page</title>
    </head>
    <body>
        <form action="question" method="post">

            VID:    <input type="text" name="vid"/><br>
        CID:<input type="text" name="cid"/><br>
        QUESTION:<input type="text"name="questiontext"/><br>
        <input type="submit" name="submit" value="Submit"/>
        <input type="reset" value="Reset"/>
        </form>
        
    </body>
</html>
