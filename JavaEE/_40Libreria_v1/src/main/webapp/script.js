$(document).ready(function() {
	$("#btnMostarLibros").click(function() {
		var url = "FrontController";
		var params = { "operation": "doMostrarLibros", "idTema": $("#temaSel").val() };
		//alert($("#temaSel").val());
		$.get(url, params, function(data) {

			var tabla = "<table class='table'><tr><th>Título</th><th>Páginas</th><th>Precio</th></tr>";
			$.each(data, function(i, p) {
				tabla += "<tr><td>" + p.titulo + "</td><td>" + p.paginas + "</td><td>" + p.precio + "</tr>";
				console.log(JSON.stringify(data));
			});
			tabla += "</table>";
			$("#tblLibros").html(tabla);
		});
	});
});