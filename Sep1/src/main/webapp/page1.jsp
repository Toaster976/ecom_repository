<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
	<h4>${param.productName}</h4>
	<h6>${param.productDesc}</h6>
	<%
	out.println("<img src='pics/"+request.getParameter("pic")+"' style='width:300px;'>");
	%>
	<h6>Price${param.customerPrice}$</h6>
		<form action="addToShopCart">
			<input type='hidden' name='productid' value='<%=request.getParameter("productid") %>'/>
			<input type='hidden' name='productName' value='<%=request.getParameter("productName")%>'/>
			<input type='hidden' name='productDesc' value='<%=request.getParameter("productDesc")%>'/>
			<input type='hidden' name='pic' value='"+<%=request.getParameter("pic")%>+"'/>
			<input type='hidden' name='customerPrice' value='<%=request.getParameter("customerPrice")%>'/>
			<input type='text' name='qtyOrder' value='1'/>
			<button>add to cart</button>
		</form>
	</body>
</html>