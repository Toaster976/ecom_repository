<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="p1.class1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Using a class inside an expression </h1>
<h2>
Convert my name to upper case: <%= class1.makeItUpper("Aidan")%>
</h2>

</body>
</html>