<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Productos</title>
<style type="text/css">
body {
	color: blue;
}

h1 {
	text-align: center;
}

div {
	width: 400px;
	margin: 50px auto;
	padding: 15px;
	background-color: smocke;
	border: 1px solid blue;
}

a {
	display: block;
	width: 60%;
	border: 1px solid blue;
	margin: 0 auto;
	margin-bottom: 20px;
	padding: 15px;
	margin-bottom: 20px;
	text-decoration: none;
}

a:hover {
	background: blue;
	color: white;
}
</style>
</head>
<body>
	<div>
		<h3>Nombre: ${requestScope.producto.nombre}</h3>
		<h3>Categoría: ${requestScope.producto.categoria}</h3>
		<h3>Precio: ${requestScope.producto.precio}</h3>
		<br>
		<a href="FrontController?operation=toInicio">Inicio</a>
	</div>
</body>
</html>