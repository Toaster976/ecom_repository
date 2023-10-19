<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page 2</title>
</head>
<body>
<h1> Page 2 Results </h1>
<h2>
<% 

String teamName = (String) session.getAttribute("teamName");
String teamMember1 = (String) session.getAttribute("teamMember1");
String teamMember2 = (String) session.getAttribute("teamMember2");
String teamMember3 = (String) session.getAttribute("teamMember3");
String teamMember4 = (String) session.getAttribute("teamMember4");

out.println("<h2> Team Name: </h2>");
out.println("<p>");
out.println(teamName);
out.println("</p>");
out.println("<h2> Team Members: </h2>");
out.println("<p>");
out.println(teamMember1 + "</br>");
out.println(teamMember2 + "</br>");
out.println(teamMember3 + "</br>");
out.println(teamMember4 + "</br>");
out.println("</p>");
%>
</h2>


</body>
</html>