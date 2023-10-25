<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
 String makeItLower(String data)
 {
	return data.toLowerCase();
 }
%>
<h1>JSP Declarations</h1>

<p>
	Lower case "Hello World": <%=makeItLower("Hello World") %>
</p>
</body>
</html>