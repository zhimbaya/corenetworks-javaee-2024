<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Contador</title>
</head>
<body>
	<center>
		<h1>Has entrado  ${sessionScope.contador} veces</h1>
		<h2>N�mero total de visitas a mi p�gina:${applicationScope.global}</h2>
		<br>
		<a href="inicio.html">Volver</a>
	</center>
</body>
</html>