<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Resultado</title>
</head>
<body>
	<center>
		<h1>Has entrado <%=session.getAttribute("contador") %></h1>
		<br>
		<a href="inicio.html">Volver</a>
	</center>
</body>
</html>