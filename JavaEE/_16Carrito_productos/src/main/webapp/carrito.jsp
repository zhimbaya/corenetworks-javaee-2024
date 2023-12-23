<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List , model.Producto"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Has entrado <%=session.getAttribute("carrito") %></h1>
		
		
		<%List<Producto> productos = (List<Producto>) session.getAttribute("carrito");%>
		<table>
			<tr>
				<td>Nombre</td>
				<td>Precio</td>
				<td>Categoria</td>
				<td></td>
			</tr>
			<tr>
				<%for (Producto p : productos){ %>
				<td><%=p.getNombre()%></td>
				<td><%=p.getPrecio()%></td>
				<%}%>
				<td><a href="EliminarProductoServlet">Eliminar</a></td><br>
			</tr>
			
		</table>
		<a href='inicio.html'>Volver</a>
	</center>
</body>
</html>