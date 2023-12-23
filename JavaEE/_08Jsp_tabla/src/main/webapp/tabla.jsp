<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mi tabla jsp</title>
</head>
<body>
	<div style="text-align: center;">
		<table style="text-align: center; border:'1'">
		<%for (int i = 0; i <= 10; i++) {%>
			<tr>
			<%for (int j = 0; j <= 10; j++) {%>
				<td><%=i*j%></td>
			<%}%>
			</tr>
		<%}%>
		</table>
	</div>
</body>
</html>