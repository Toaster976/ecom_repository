<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
	
	<form action="ecom_productslist" >
		<button>Product List</button>
	</form>
	
	<form action="ecom_showCart" >
		<button>Cart</button>
	</form>
	
	<h4>${param.product_name}</h4>
	<h6>${param.product_description}</h6>
	<%
	out.println("<img src='"+request.getParameter("image")+"' style='width:300px;'>");
	%>
	<p>Price: ${param.product_price}$</p>
	<p>Number in Stock: ${param.product_qty_available}$</p>
		<form action="ecom_addToCart">
			<input type='hidden' name='product_id' value='<%=request.getParameter("product_id") %>'/>
			<input type='hidden' name='product_name' value='<%=request.getParameter("product_name")%>'/>
			<input type='hidden' name='product_description' value='<%=request.getParameter("product_description")%>'/>
			<input type='hidden' name='image' value='<%=request.getParameter("image")%>'/>
			<input type='hidden' name='product_price' value='<%=request.getParameter("product_price")%>'/>
			<input type='hidden' name='product_qty_available' value='<%=request.getParameter("product_qty_available")%>'/>
			<input type='text' name='qty' value='1'/>
			<button>Add to Cart</button>
		</form>
	</body>
</html>