<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <meta http-equiv="Expires" content="0">
    <meta http-equiv="Last-Modified" content="0">
    <meta http-equiv="Cache-Control" content="no-cache, mustrevalidate" />
    <meta http-equiv="Pragma" content="no-cache"> 
    <title>Lista Productos</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            color: #333;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            color: #9933cc; /* Púrpura */
        }

        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: #fff;
            border: 1px solid #ddd;
        }

        th, td {
            padding: 12px;
            border: 1px solid #ddd;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        a {
            display: block;
            text-align: center;
            padding: 10px;
            margin: 20px auto;
            color: #fff;
            background-color: #9933cc; /* Púrpura */
            text-decoration: none;
            border-radius: 4px;
            width: 120px;
        }

        a:hover {
            background-color: #660099; /* Púrpura oscuro al hacer hover */
        }
    </style>
</head>
<body>
    <h2>Productos de ${param.categoria} </h2>
    <table>
        <tr>
            <th>Nombre</th>
            <th>Precio</th>
        </tr>
        <c:forEach var="pr" items="${requestScope.productos}">
            <tr>
                <td>${pr.nombre}</td>
                <td>${pr.precio}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="toInicio">Volver a Inicio</a>
</body>
</html>
