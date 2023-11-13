<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer order</title>
<style>
		.center {
			position: relative;
			text-align: center;
			margin-left: auto;
			margin-right: auto;
		}
		button{
            background-color: cornflowerblue;
            color: rgb(0, 0, 0);
            padding: 10px 20px;
            text-decoration: none;
            border-radius: 20px;
            transition: background-color 0.3s ease;    
        }
        
        button:hover{
            background-color: rgb(255, 255, 255);
        }
</style>
</head>
<body style="background-color:#99ccff;">
	<div class="center">
	
	<h4 style="font-size:20pt; font-family:Sans-serif;">${param.customerName}</h4>
	<b>Customer ID: </b><%=request.getParameter("id") %><br>
	<b>Card Info: </b><%=request.getParameter("cardInfo") %><br><br>
	<b>Email: </b><%=request.getParameter("email") %> <br><br>
	<b>Address: </b><%=request.getParameter("address") %><br><br>
	
	
	
	<h4 style="font-size:15pt; font-family:Sans-serif;">Products Ordered</h4>
	<%String pid[] = request.getParameterValues("pid");
		String coinName[] = request.getParameterValues("coinName");
		String coinDesc[] = request.getParameterValues("coinDesc");
		String price[] = request.getParameterValues("price");
		String pic[] = request.getParameterValues("pic");
		String qty[] = request.getParameterValues("qty");
	%>
	
	<%for (int i=0; i < pid.length; i++) {%>					<%--for loop to get all products informations the customer ordered --%>
		<hr style="border-color:#000000; height:2px;">
		
		<%out.println("<img src=\""+pic[i]+ "\"' style='width:150px;'>"); %> <br/> <br/>
		<%out.println("<b>Product ID: </b>"+pid[i]); %> <br/>
		<%out.println("<b>Name: </b>"+coinName[i]); %> <br/><br>
		<%out.println("<b>Description: </b>"+coinDesc[i]); %> <br/><br>
		<%out.println("<b>Price: </b>"+price[i]); %> <br/><br>
		
		<%out.println("<b>Quantity: </b>"+qty[i]); %> <br/>
		
	<%} %>
	
	<hr style="border-color:#000000; height:2px;">
	<h4 style="font-size:15pt; font-family:Sans-serif;">Status - <%=request.getParameter("status") %></h4>
	
	
	<%--to change the status to shipped or delivered --%>
	<form action="editOrders">
		<input type='hidden' name='status' value='shipped'>
		<input type='hidden' name='id' value='<%=request.getParameter("id") %>'/> <br/>
		<button>Update status to Shipped</button>
	</form>
	<form action="editOrders">
		<input type='hidden' name='status' value='delivered'>
		<input type='hidden' name='id' value='<%=request.getParameter("id") %>'/> <br/>
		<button>Update status to Delivered</button>
	</form>
	
	</div>
</body>
</html>