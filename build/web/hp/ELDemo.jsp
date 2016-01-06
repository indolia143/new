<hr>
<h3 align="center">${"EL DEMO JSP PAGE"}</h3>
<hr>
EL IMPLICIT OBJECTS:<br>
HELLO ${param.name}<br>
A + B = ${param.a + param.b}<br>
Copyright to ${initParam.copyright}

<hr>
ARITHMETIC OPR : <br>
2 + 2 = ${2 + 2}<br>
2 / 3 = ${2 / 3}<br>
5 mod 2 = ${5 mod 2}<br>
5 % 2 = ${5 % 2}<br>

<hr>
RELATIONAL OPR : <br>
2 == 2 = ${2 == 2}<br>
2 eq 3 = ${2 eq 3}<br>
5 >= 2 = ${5 >= 2}<br>
<hr>
LOGICAL OPR : <br>
2 == 2 and 3 eq 3 = ${2 == 2 and 3 eq 3}<br>
2 == 2 && 3 eq 3 = ${2 == 2 && 3 eq 3}<br>
2 == 2 || 3 eq 3 = ${2 == 2 || 3 eq 3}<br>
2 == 2 or 3 eq 3 = ${2 == 2 or 3 eq 3}<br>

<hr>
EMPTY OPR : <br>
NAME is null : ${name eq null}<br>
NAME is Empty : ${name eq ''}<br>
NAME is null or Empty: ${empty name}<br>
<hr>
CONDITIONAL OPR : <br>
3 is greater than 2 : ${3 > 2 ? 'YES':'NO'}


