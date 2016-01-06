<%@page import="java.util.*" %>
<script>
function go() {
window.location.replace("logout.jsp",'window','toolbar=1,location=1,directories=1,status=1,menubar=1,scrollbars=1,resizable=1');
self.close()
}
</script>
DO YOU WANT TO REALLY LOGOUT  IN THAT CASE BROWSER PAGES WILL BE CLOSED:
<a href="javascript:go()"><b>Logout</b></a>
