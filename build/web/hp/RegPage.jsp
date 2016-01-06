<hr>
<h2 align="center">REGISTRATION PAGE</h2>
<hr>
<jsp:useBean id="stu" scope="session" class="bean.Student"/>

<jsp:setProperty name="stu" property="*"/>

<h3>STUDENT DETAILS : </h3>
STUDENT NAME : <jsp:getProperty name="stu" property="name"/><br>
COLLEGE NAME : <jsp:getProperty name="stu" property="college"/><br>
PRMT ADDRESS : <jsp:getProperty name="stu" property="address"/><br>
<a href="GetBeanData.jsp">
    GET, SAVED BEAN DATA
</a>