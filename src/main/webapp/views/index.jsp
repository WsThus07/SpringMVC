<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="ss" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Add Article</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
</head>
<body>
<p>  <a href="logout" class="btn btn-outline-danger">logout</a></p>
    <h3>${login}</h3>
    <FORM action = "addArticle" method ="post">
		<TABLE > <TR> <TD><b>description</b></TD>
		<TD><input type="text" name="description" style="width:300px"></TD></TR>
		<TR><TD> <b>brand </b> </TD>
		<TD><input type="text" name="brand" style="width:300px"></TD></TR>
		<TR><TD> <b>price </b> </TD>
		<TD><input type="text" name="price" style="width:300px"></TD></TR>
		<TR><TD colspan =2 align=center >
		<input type ="submit" name="Valider" value="Add Article"></TD></TR>
		</TABLE> 
	</FORM> 
	<ss:if test="${listeArticles.size()>0}" >
<TABLE >
	<TR>
		<TH >brand</TH> 
		<TH >price</TH>
		<TH >description</TH>
	</TR>
	<ss:forEach items="${listeArticles}" var='a'>
	<TR>  
	 	<TD>  ${a.brand} </TD>
	 	<TD>  ${a.price}  </TD>
	 	<TD>  ${a.description} </TD>
	 	<TD> <a href="articles/delete?code=${a.idArticle}">delete</a> </TD>
	</TR>
	</ss:forEach>
	
</TABLE>
</ss:if>
</body>
</html>