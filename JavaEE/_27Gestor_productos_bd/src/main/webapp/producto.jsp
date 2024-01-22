<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Productos</title>
<link rel="stylesheet" type="text/css" href="estilos.css" />
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