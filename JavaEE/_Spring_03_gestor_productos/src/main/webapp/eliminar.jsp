<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Expires" content="0">
    <meta http-equiv="Last-Modified" content="0">
    <meta http-equiv="Cache-Control" content="no-cache, mustrevalidate">
    <meta http-equiv="Pragma" content="no-cache"> 
    <title>Eliminar Producto</title>
	    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            color: #333;
            margin: 0;
            padding: 0;
        }

        div {
            width: 400px;
            margin: 50px auto;
            padding: 15px;
            background-color: #fff;
            border: 1px solid #ddd;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
            color: #9933cc; /* Púrpura */
        }

        form {
            display: flex;
            flex-direction: column;
        }

        input {
            margin: 10px 0;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #9933cc; /* Púrpura */
            color: #fff;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #660099; /* Púrpura oscuro al hacer hover */
        }
    </style>
</head>
<body>
    <div>
        <h1>Eliminar Producto</h1>
        <form action="eliminar" method="post">
            <input type="text" name="nombre" placeholder="Nombre del producto a eliminar">
            <input type="submit" value="Eliminar">
        </form>
    </div>
</body>
</html>
