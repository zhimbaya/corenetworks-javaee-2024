<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="jakarta.tags.core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Expires" content="0">
	<meta http-equiv="Last-Modified" content="0">
	<meta http-equiv="Cache-Control" content="no-cache, mustrevalidate">
	<meta http-equiv="Pragma" content="no-cache">
	<title>Temas</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	<script type="text/javascript" src="script.js"></script>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container text-center">
		<div class="row justify-content-md-center">
			<div class="col-4 p-5">
				<fieldset>
					<legend>Seleccione un tema:</legend>
					<select name="temaSel" class="form-select" id="temaSel">
						<option value="0">-Todos-</option>
						<c:forEach var="t" items="${requestScope.tema}">
							<option value="${t.idTema}">${t.tema}</option>
						</c:forEach>
					</select>
				</fieldset>
				<br>
				<input type="button" id="btnMostarLibros" value="Mostrar" class="btn btn-success"/>
				<br>
				<div id="tblLibros"></div>
				<br>
				<h2>Carrito</h2>
				<div id="tblCarrito"></div>
				<br>
				<a href="FrontController?operation=toInicio" class="btn btn-warning">Home</a>
			</div>
		</div>
	</div>

</body>
</html>