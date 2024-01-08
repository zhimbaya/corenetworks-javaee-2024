<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*,model.*"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!-- A�ADIR LA ACCI�N O ETIQUETA -->
<!-- 
1.- Configure - converter to maven proyect
2.- Agregar la dependencia de mvn en el pom (la especificaci�n y la implementaci�n)
3.- Agregar la acci�n o etiqueta
4.- Utilizar las etiquetas en el proyecto.
5.- Ejecutar y funciona aunque aparece un ERROR.

 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cerrar Sesi�n</title>
</head>
<body>
	<a href="CerrarSesionServlet">Cerrar sesi�n</a>
	<center>
		<c:if test="${!empty sessionScope.carrito}">
			<table border="1">
				<tr>
					<th>Nombre</th>
					<th>Precio</th>
					<th>Categoria</th>
					<th></th>
				</tr>
				<c:forEach var="pr" items="${sessionScope.carrito}">
					<tr>
						<td>${pr.nombre}</td>
						<td>${pr.precio}</td>
						<td>${pr.categoria}</td>
						<td><a href="EliminarCarritoServlet?nombre=${pr.nombre}">Eliminar</a></td>
					</tr>
				</c:forEach>
				</c:if>
			</table>
			<br>
			<br>
			<a href="menu.html">volver</a>
	</center>
</body>
</html>