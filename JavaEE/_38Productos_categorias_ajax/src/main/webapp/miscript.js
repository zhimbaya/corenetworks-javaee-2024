$(document).ready(function() {
	$("#btnMostrar").click(function() {
		//var url = "FrontController?operation=doBuscarPorCategoria?categoria="+$("#categoria").val();
		var url = "FrontController";
		var params = { "operation": "doBuscarPorCategoria", "categoria": $("#categoria").val() };
		//var json = JSON.parse(url);
		//console.log(JSON.parse(url));
		$.get(url, params, function(data) {
			console.log(JSON.stringify(url));
			//alert(JSON.stringify(data));
			var tabla = "<table><tr><th>Nombre</th><th>Precio</th></tr>";
			$.each(data, function(i, p) {
				tabla += "<tr><td>" + p.nombre + "</td><td>" + p.precio + "</td></tr>";
			});
			tabla += "</table>";
			$("#tblProductos").html(tabla);
		});
	});
});
