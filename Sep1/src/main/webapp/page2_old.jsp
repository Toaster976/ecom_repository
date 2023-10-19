<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> JSP Scriptlet Example </h1>
<p>
<%
out.println("<ul>");
for (int i = 1; i < 5; i++)
	out.println("<li>CSE 3021" + i + "</li>");

out.println("</ul>");
%>
</p>
</body>
</html>