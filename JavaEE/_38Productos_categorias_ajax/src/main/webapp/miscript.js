$("#btnMostrar").click(lanzarPeticion);
function lanzarPeticion() {
	//var url = "FrontController?operation=doBuscarPorCategoria&categoria="+$("#categoria").val();
	var url = "FrontController";
	var params = { "operation": "doBuscarPorCategoria", "categoria": $("categoria").val() };
	$.get(url, params, function(data) {
		alert(JSON.stringify(data));
		var tabla = "<table><tr><th>Nombre</th><th>Precio</th></tr>";
		$.each(data, function(i, p) {
			tabla += "<tr><td>" + p.nombre + "</td><td>" + p.precio + "</td></tr>";
		});
		tabla += "</table>";
		$("#tblProductos").html(tabla);
	});
}