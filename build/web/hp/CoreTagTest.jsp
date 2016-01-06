<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h3 align="center">JSTL CORE TAG DEMO PAGE</h3>
<hr>
IF TAG : <br>
<c:if test="${param.name ne null}">
    HELLO ${param.name}
</c:if>
<hr>
SET TAG:<br>
<c:set var="mv" value="ABC"/>
My Variable : ${mv}
<hr>
NORMAL FOR LOOP : Using FOREACH TAG :-<br>
<c:forEach var="i" begin="1" end="10">
 ${param.t} X ${i} = ${param.t*i}<br>
</c:forEach>
 <hr>
EXTENDED FOR LOOP : Using FOREACH TAG :-<br>
<c:forEach var="i" items="${paramValues.ch}">
 ${i} <br>
</c:forEach>
 <hr>
 FORTOKEN TAG :<br>
SELECT DATE OF BIRTH:<br>
<select name="date">
    <c:forEach var="i" begin="1" end="31">
    <option value="${i}">${i}</option>
    </c:forEach>
</select>
<select name="month">
    <c:forTokens var="i" delims="," items="Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec">
    <option value="${i}">${i}</option>
    </c:forTokens>
</select>
<select name="year">
    <c:forEach var="i" begin="1980" end="2008">
    <option value="${i}">${i}</option>
    </c:forEach>
</select>



