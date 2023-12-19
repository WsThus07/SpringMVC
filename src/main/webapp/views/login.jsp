<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>

   <FORM action = "login" method ="post">
		<TABLE > <TR> <TD><b>login </b></TD>
		<TD><input type="text" name="login" style="width:300px"></TD></TR>
		<TR><TD> <b>password </b> </TD>
		<TD><input type="text" name="password" style="width:300px"></TD></TR>
		<TR><TD colspan =2 align=center >
		<input type ="submit" name="Valider" value="login"></TD></TR>
		</TABLE> 
	</FORM> 
	<h2>${empty error}</h2>

</body>
</html>
