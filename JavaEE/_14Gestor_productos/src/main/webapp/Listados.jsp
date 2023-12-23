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
		<h2>Productos de <%=request.getParameter("categoria") %> </h2>
		
		<%List<Producto> listados = (List<Producto>) request.getAttribute("listar");%>
		<table>
		<tr>
			<td>Nombre</td>
			<td>Precio</td>
			<%for (Producto p : listados){ %>
			<td><%=p.getNombre()%></td>
			<td><%=p.getPrecio()%></td><br>);
			<%}%>
		</tr>
		</table>
		
		<a href='Inicio.html'>Volver</a>
	</center>
</body>
</html>