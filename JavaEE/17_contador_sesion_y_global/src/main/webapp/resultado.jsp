<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Has entrado  ${requestScope.contador} veces</h1>
		<h2>N�mero total de visitas a mi p�gina:${requestScope.global}</h2>
		<br>
		<a href="inicio.html">Volver</a>
	</center>
</body>
</html>