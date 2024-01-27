<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Resultados</title>
	<link rel="stylesheet" type="text/css" href="miestilo.css">
</head>
<body>
	<c:forEach var="r" items="${resultados}">
		<h2><a href="${r.url}">${r.url}</a></h2>
		<h4>${r.descripcion}</h4>
		<hr>
	</c:forEach>
	<br>
	<h3>
	<a href="toBuscar">Volver</a>
	</h3>
</body>
</html>