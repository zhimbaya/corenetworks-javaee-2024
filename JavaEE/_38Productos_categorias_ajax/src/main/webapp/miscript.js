$("#btnMostrar").click(
    function (){
        var url = "FrontController?operation=doBuscarPorCategoria&categoria="+$("#categoria").val();
        $.get(url,function(data){
            var tabla = "<table><tr><th>Nombre</th><tr><th>Precio</th></tr>";
            $.each(data,function(i,p){
                tabla += "<tr><td>"+p.nombre+"</td><td>"+p.precio+"</td></tr>";
            });
            tabla +="</table>";
            $("#tbProductos").html(tabla);
        });
    }
);