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

