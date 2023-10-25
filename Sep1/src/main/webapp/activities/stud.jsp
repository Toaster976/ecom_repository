<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is the JSP Confirmation Page</h1>
Student first name is <%= request.getParameter("fname") %>
<br/><br/>
Student last name is <%= request.getParameter("lname") %>
<br/><br/>
Programming language is <%= request.getParameter("progL") %>
<br/><br/>
Country is <%= request.getParameter("country") %>
<br/><br/>
<% String[] fruits=request.getParameterValues("fruit");
out.println("<ul>");
for (String s:fruits)
{
	out.println("<li>"+s+"</li>");
}
out.println("</ul>");
%>

<br/><br/>
<h1>Param alternative</h1>
Student first name is ${param.fname}
<br/><br/>
Student last name is ${param.lname}
<br/><br/>
Programming language is ${param.progL}
<br/><br/>
Country is ${param.country}

</body>
</html>