<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>JSP</title>
</head>
<body>
	<div style="text-align: center;">
		<%for (int i = 1; i <= 6; i++) {%>
			<h<%=i%>>Primera página en JSP</h<%=i%>>
		<%}%>
	</div>
</body>
</html>