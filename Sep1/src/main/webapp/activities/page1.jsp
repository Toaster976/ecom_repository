<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page 1</title>
</head>
<body>
<h1> Page 1 Activity 6 </h1>
<h2>
<% 

String teamName="CoinCrafters Tech";
String teamMember1="Aidan Parral";
String teamMember2="Quentin Drake";
String teamMember3="Guillian Germino";
String teamMember4="Christian Morales";

session.setAttribute("teamName",teamName);
session.setAttribute("teamMember1",teamMember1);
session.setAttribute("teamMember2",teamMember2);
session.setAttribute("teamMember3",teamMember3);
session.setAttribute("teamMember4",teamMember4);

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

<form action="page2.jsp">

<button>To Page 2</button>
</form>

</body>
</html>