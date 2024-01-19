<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Correcto</title>
</head>
<body>
	<center>
		<h1>Correcto</h1>
		<%String usuario = request.getParameter("usuario");%>
		<p>El usuario <%=usuario%></p>
		<h3>Es valido</h3>
		<a href="login.html">Volver</a>
	</center>
</body>
</html>