<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<s:setDataSource driver="com.mysql.jdbc.Driver"
                 url="jdbc:mysql://localhost:3306/batch1"
                 user="root" password=""/>

<s:update var="ur">
  insert into movie values(${param.id},'${param.name}','${param.type}')
</s:update>

<jsp:forward page="SQLTagDemo.jsp"/>