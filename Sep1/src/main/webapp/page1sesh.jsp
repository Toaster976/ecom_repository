<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>${ param.productName}
<% 

String productID=request.getParameter("productid");
session.setAttribute("productid",productID);

session.setAttribute("user","Aidan Parral");

%>
</h2>

<h2>${param.productid}</h2>

<form action="addToShopCart">
	<input type='hidden' name='productid' value='"+<%=request.getParameter("productid")%>+"'/>
	<input type='hidden' name='productName' value='"+<%=request.getParameter("productName")%>+"'/>
	<input type='hidden' name='productDesc' value='"+<%=request.getParameter("productDesc")%>+"'/>
	<input type='hidden' name='pic' value='"+<%=request.getParameter("pic")%>+"'/>
	<input type='hidden' name='customerPrice' value='"+<%=request.getParameter("customerPrice")%>+"'/>
	<input type='text' name='qtyOrder' placeholder='1'/>

<button>add to cart</button>
</form>

</body>
</html>