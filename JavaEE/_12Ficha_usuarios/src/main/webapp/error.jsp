<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Error</title>
</head>
<body>
	<center>
		<h1>Error</h1>
		<%String usuario = request.getParameter("usuario");%>
		<%String password = request.getParameter("password");%>
		<p>El usuario <%=usuario%> con contraseña <%=password%></p>
		<h3>No Existe</h3>
		<a href="login.html">Volver</a>
	</center>
	
</body>
</html>