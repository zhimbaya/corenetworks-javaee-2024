<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="jakarta.tags.core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Temas</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>
	<center>
		<h1>Seleccione Tema</h1>
		<select id="temaSel" >
			<option value="0">-Todos-</option>
			<c:forEach var="t" items="${requestScope.temas}">
				<option value="${t.idTema}">${t.tema}</option>
			</c:forEach>
		</select>
		<br><br>
		<div id="tbLibros">
		</div>
		<br>
		<h2>Carrito</h2>
		<div id="tbCarrito">
		</div>
	</center>
	<script type="text/javascript">
		$("#temaSel").change(function(){
			var url="FrontController";
			var params={"operation":"doLibros","idTema":$("#temaSel").val()};
			gestionarPeticion(url,params);
		});
	
	function gestionarPeticion(url,params){
		$.get(url,params,function(data){
			var tabla="<table border='1'>";
			tabla.concat("<tr><th>Titulo</th>");
			tabla.concat("<th>Precio</th>");
			tabla.concat("<th>Páginas</th>");
			tabla.concat("<th>Tema</th><th></th></tr>");
			$.each(data,function(i,p){
				tabla+="<tr><td>".concat(p.titulo);
				tabla+="</td><td>".concat(p.precio);
				tabla+="</td><td>".concat(p.paginas);
				tabla+="</td><td>".concat(p.temaDto.tema);
				tabla+="</td><td><a href='#' onclick='agregarCarrito("+p.isbn+")'>Agregar</a></td></tr>";
			});
			tabla+="</table>";
			$("#tbLibros").html(tabla);
		});
	}
	function agregarCarrito(isbn){		
		
		var params={"operation":"doAgregarCarrito","isbn":isbn};
		pintarCarrito(params);
	}
	
	function quitarCarrito(pos){		
		var params={"operation":"doQuitarCarrito","pos":pos};
		pintarCarrito(params);
	}
	function pintarCarrito(params){
		var url="FrontController";
		$.get(url,params,function(data){
			var tabla="<table border='1'>";
			tabla.concat("<tr><th>Titulo</th>");
			tabla.concat("<th>Precio</th>");
			tabla.concat("<th>Páginas</th>");
			tabla.concat("<th>Tema</th><th></th></tr>");
			$.each(data,function(i,p){
				tabla+="<tr><td>".concat(p.titulo);
				tabla+="</td><td>".concat(p.precio);
				tabla+="</td><td>".concat(p.paginas);
				tabla+="</td><td>".concat(p.temaDto.tema);
				tabla+="</td><td><a href='#' onclick='quitarCarrito("+i+")'>Quitar</a></td></tr>";
			});
			tabla+="</table>";
			$("#tbCarrito").html(tabla);
		});
	}
	</script>
</body>
</html>