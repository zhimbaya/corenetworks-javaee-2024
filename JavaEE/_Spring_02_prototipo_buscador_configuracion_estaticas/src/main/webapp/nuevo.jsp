<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Nuevo</title>
	<link rel="stylesheet" type="text/css" href="miestilo.css">
</head>
<body>
	<center>
		<form action="guardar" method="Post">
			Url: 
			<input type="text" name="url">
			Temática:
			<input type="text" name="tematica">
			Descripción:
			<input type="text" name="descripcion">
			<br>
			<br>
			<input type="submit" value="Guardar">
		</form>
		<br>
		<h3>
		<a href="toBuscar">Buscar</a>
		</h3>
	</center>
</body>
</html>