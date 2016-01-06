
<h3 align="center">PROMISES LIST</h3>
<hr>
<table align="center" bgcolor="lightgreen" border="1">
    <tr>
        <th>CID</th>
        <th>PROMISES</th>
        <th>OPR</th>
    </tr>
     <form action="editpromises" method="post">
        <tr bgcolor="white">
        <td><input type="text" name="cid" size="3"></td>
        <td><input type="text" name="promises"></td>

        <td><input type="submit" value="UPDATE"></td>
    </tr>
    </form>
    </c:if>
    <c:if test="${s.count%2 != 0}">
    <form action="editpromises" method="post">
        <tr bgcolor="white">
        <td><input type="text" name="cid" size="3"></td>
        <td><input type="text" name="promises"></td>

        <td><input type="submit" value="UPDATE"></td>
    </tr>
    </form>
    </c:if>
    </c:forEach>
    <form action="addpromises">
    <tr>
        <td><input type="text" name="cid" size="3" /></td>
        <td><input type="text" name="promises"/></td>

        <td><input type="submit" value="ADD"/></td>
    </tr>
    </form>
</table>
