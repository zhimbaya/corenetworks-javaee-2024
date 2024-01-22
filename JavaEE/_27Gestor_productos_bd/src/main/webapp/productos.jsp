<%@page import="model.Producto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="model.Producto, java.util.List"%>
<%@taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Expires" content="0">
	<meta http-equiv="Last-Modified" content="0">
	<meta http-equiv="Cache-Control" content="no-cache, mustrevalidate">
	<meta http-equiv="Pragma" content="no-cache">
	<meta charset="UTF-8">
	<title>Productos por categoria</title>
	<link rel="stylesheet" type="text/css" href="estilos.css" />
</head>
<body>
	<div>
		<h2>Productos de ${param.categoria}</h2>
		<table border="1">
			<tr>
				<th>Nombre</th>
				<th>Precio</th>
			</tr>
			<c:forEach var="pr" items="${requestScope.producto}">
				<tr>
					<td>${pr.nombre}</td>
					<td>${pr.precio}</td>
				</tr>
			</c:forEach>
		</table>
		<a href="FrontController?operation=toInicio">Volver al Inicio</a>
	</div>
</body>
</html>