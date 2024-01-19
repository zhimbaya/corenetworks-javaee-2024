<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="model.Resultado, java.util.List" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Lista de resultados</title>
</head>
<body>
	<center>
		<%List<Resultado> resultados = (List<Resultado>) request.getAttribute("resultado");%>
		<%for (Resultado b : resultados){ %>
			<h1>Lista de tematica : <%=b.getTematica()%></h1>
			<h2><a href="<%=b.getUrl()%>"><%=b.getUrl()%></a></h2>
			<h4><%=b.getDescripcion()%></h4><br>
		<%}%>
		<a href='Inicio.html'>Volver</a>
	</center>
</body>
</html>