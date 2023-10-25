<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello World from JSP</h1>
<p>
	The date in the server is <%= new java.util.Date() %>
</p>
<p> 
	Converting my name to uppercase: <%= new String("Aidan Parral").toUpperCase() %>
</p>
<h2> 
	24 * 4= <%= 24*4 %>
</h2>

<h2> 
	Is 75 less than 96? <%= 75 < 96 %>
</h2>


</body>
</html>