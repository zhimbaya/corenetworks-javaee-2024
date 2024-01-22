<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="model.Curso,java.util.ArrayList"%>
<%@taglib uri="jakarta.tags.core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="Expires" content="0">
	<meta http-equiv="Last-Modified" content="0">
	<meta http-equiv="Cache-Control" content="no-cache, mustrevalidate">
	<meta http-equiv="Pragma" content="no-cache">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script> 
	<title>Cursos</title>
</head>
<body>
	<div class="container text-center">
		<div class="row justify-content-md-center">
			<div class="col-4">
				<div class="mb-3 mt-3">
					<h1 class="h1">Cursos cuyo precio máximo es ${param.precio}</h1>
					<br>
					<c:if test="${!empty requestScope.cursos}">
						<table border="1" class="table">
							<tr>
								<th>Nombre</th>
								<th>Duración</th>
								<th>Precio</th>
							</tr>
							<%--recuperamos el arraylist de cursos que está en un atributo de petición,
							lo recorremos y mostramos una fila por cada curso --%>
							<c:forEach var="c" items="${requestScope.cursos}">
								<tr>
									<td>${c.nombre}</td>
									<td>${c.duracion}</td>
									<td>${c.precio}</td>
								</tr>
							</c:forEach>
						</table>
					</c:if>
					<c:if test="${empty requestScope.cursos}">
						<h1 class="h1">No hay cursos con ese criterio</h1>
					</c:if>
					<br>
					<a href="FrontController?operation=toMenu" class="btn btn-primary">volver</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>