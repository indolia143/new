<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<s:setDataSource driver="com.mysql.jdbc.Driver"
                 url="jdbc:mysql://localhost:3306/onps"
                 user="root" password="mysql"/>

<s:update var="ur">
  delete from promises where cid=${param.mid}
</s:update>

<jsp:forward page="addandeditpromises.jsp"/>