<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
	<title>Error</title>
</head>
<body>
	<div class="container text-center">
		<div class="row justify-content-md-center">
			<div class="col-4">
				<div class="mb-3 mt-3">
					<h3>El usuario <%=request.getParameter("usuario") %> con contraseña 
					<%=request.getParameter("password") %>, no existe!</h3>
					<br>
					<a href="FrontController?operation=toMenu" class="btn btn-primary">Volver</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>