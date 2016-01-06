<%@page import="java.util.*" %>
<script>
function go() {
window.location.replace("logout.jsp",'window','toolbar=1,location=1,directories=1,status=1,menubar=1,scrollbars=1,resizable=1');
self.close()
}
</script>
<%String str = request.getParameter("UserName");
session.setAttribute("UserName", request.getParameter("UserName"));%>
Welcome to <%= session.getAttribute( "UserName" ) %>
<% if (session.getAttribute("UserName").equals("")){%>
<a href="login.jsp"><b>Login </b></a>
<%}
else{%>
<a href="javascript:go()"><b>Logout</b></a>
<%}
%>