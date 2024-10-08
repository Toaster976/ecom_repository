<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>${param.product_name}</title>
		<style>
		.center {
		position: relative;
		text-align: center;
		margin-left: auto;
		margin-right: auto;
		}
		button{
            background-color: rgb(255, 255, 255);
            color: rgb(0, 0, 0);
            padding: 10px 20px;
            text-decoration: none;
            border-radius: 20px;
            transition: background-color 0.3s ease;    
        }
        
        button:hover{
            background-color: cornflowerblue;
        }
		</style>
	</head>
	<body>
	
	<div class="center">
	<h1>${param.product_name}</h1>
	<p>${param.product_description}</p>
	<%
	out.println("<img src='"+request.getParameter("image")+"' style='width:300px;'>");
	%>
	<p>Price: $${param.product_price}</p>
	<p>Number in Stock: ${param.product_qty_available}</p>
		<form action="ecom_addToCart">
			<input type='hidden' name='product_id' value='<%=request.getParameter("product_id") %>'/>
			<input type='hidden' name='product_name' value='<%=request.getParameter("product_name")%>'/>
			<input type='hidden' name='product_description' value='<%=request.getParameter("product_description")%>'/>
			<input type='hidden' name='image' value='<%=request.getParameter("image")%>'/>
			<input type='hidden' name='product_price' value='<%=request.getParameter("product_price")%>'/>
			<input type='hidden' name='product_qty_available' value='<%=request.getParameter("product_qty_available")%>'/>
			<label>Enter order quantity: </label><input type='text' name='qty' value='1'/>
			<br><br>
			<button>Add to Cart</button>
		</form>
		<br>
		<form action="ecom_productslist" >
			<button>Return to Product List</button>
		</form>
		</div>
	</body>
</html>