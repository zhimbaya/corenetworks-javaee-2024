<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List , model.Producto"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Carrito</title>
</head>
<body>
	<center>
		<h1>Has entrado al Carrito</h1>
		<%List<Producto> productos = (List<Producto>) session.getAttribute("carrito");
		if(productos!=null){%>
		<table>
			<tr>
				<th>Nombre</th><th>Precio</th><th>Categoria</th>
				<th></th>
			</tr>
			<tr>
				<%for (Producto p : productos){ %>
				<td><%=p.getNombre()%></td><td><%=p.getPrecio()%></td><td><%=p.getCategoria()%></td>
				<td><a href="EliminarProductoServlet?nombre=<%=p.getNombre()%>">Eliminar</a></td>
				<%}%>
			</tr>
		</table>
		<a href="CerrarSesionServlet">Cerrar sesión</a>
		<hr>
		<%}%>
		<a href='inicio.html'>Volver</a>
	</center>
</body>
</html>