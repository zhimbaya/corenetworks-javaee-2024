<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="model.Ficha"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Correcto</title>
</head>
<body>
	<center>
		<h1>Correcto</h1>
		<!-- Se tiene que importa la DIRECTIVA Y CASTEAR -->
		<%Ficha f = (Ficha) request.getAttribute("ficha");%>
		<h1>Ficha de <%=request.getParameter("usuario")%></h1>
		<h3>Nombre: <%=f.getUsuario()%></h3>
		<h3>Edad: <%=f.getEdad()%></h3>
		<h3>Email: <%=f.getEmail()%></h3>
		<a href="login.html">Volver</a>
	</center>

</body>
</html>