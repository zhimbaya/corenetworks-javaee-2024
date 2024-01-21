<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.util.List , model.Producto"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Productos por categoría</title>
</head>
<body>
	<center>
		<h2>Productos de la categoria: <%=request.getParameter("categoria") %> </h2>
		<%List<Producto> listados = (List<Producto>) request.getAttribute("listar");%>
		<table border="1">
			<tr>
				<td>Nombre</td>
				<td>Precio</td>
			</tr>
				<%for (Producto p : listados){ %>
			<tr>
				<td><%=p.getNombre()%></td>
				<td><%=p.getPrecio()%></td>
			</tr>
				<%}%>
		</table>
		<a href='Inicio.html'>Volver</a>
	</center>
</body>
</html>