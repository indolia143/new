<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<s:setDataSource driver="com.mysql.jdbc.Driver"
                 url="jdbc:mysql://localhost:3306/onps"
                 user="root" password="mysql"/>

<s:query var="rs" sql="select *from candidate"/>
<h3 align="center">CANDIDATE LIST</h3>
<hr>
<table align="center" bgcolor="lightgreen" border="1">
    <tr>
        <th>FIRST NAME</th>
        <th>LAST NAME</th>
        <th>CATEGORY</th>
        
    </tr>
    <c:forEach varStatus="s" var="data" items="${rs.rows}">
    
    <tr>
        <td>${data.fname}</td>
        <td>${data.lname}</td>
        <td>${data.category}</td>
        
    </tr>
   
    
    </c:forEach>
   
</table>
