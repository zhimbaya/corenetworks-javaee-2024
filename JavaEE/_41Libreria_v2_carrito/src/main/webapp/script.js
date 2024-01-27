$(document).ready(function() {
	$("#btnMostarLibros").click(function() {
		var url = "FrontController";
		var params = { "operation": "doMostrarLibros", "idTema": $("#temaSel").val() };
		
		$.get(url, params, function(data) {

			var tabla = "<table class='table'><tr><th>Título</th><th>Páginas</th><th>Precio</th><th></th></tr>";
			$.each(data, function(i, p) {
				tabla += "<tr><td>" + p.titulo + "</td><td>" + p.paginas + "</td><td>" + p.precio + "</td><td><a href='#' onclick='agregarCarriot("+p.isbn+")'>Agregar</a></td></tr>";
				console.log(JSON.stringify(data));
			});
			tabla += "</table>";
			$("#tblLibros").html(tabla);
		});
	});
});	

function agregarcarrito(isbn){
	var params = { "operation": "doAgregarCarrito", "isbn": isbn };
	pintarCarrito(params);
}
function quitarcarrito(pos){
	var params = { "operation": "doQuitarCarrito", "pos": pos };
	pintarCarrito(params);
}

function pintarCarrito(params){
	$.get(url, params, function(data) {

		var tabla = "<table class='table'><tr><th>Título</th><th>Páginas</th><th>Precio</th><th></th></tr>";
		$.each(data, function(i, p) {
			tabla += "<tr><td>" + p.titulo + "</td><td>" + p.paginas + "</td><td>" + p.precio + "</td><td><a href='#' onclick='quitarCarrito("+i+")'>Quitar</a></td></tr>";
			console.log(JSON.stringify(data));
		});
		tabla += "</table>";
		$("#tblCarrito").html(tabla);
	});
}
