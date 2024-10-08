package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ecom_productslist
 */
@WebServlet("/Inventory")
public class Inventory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inventory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        PrintWriter out2=response.getWriter();
        //initializing the database connection
        Connection mycon=null;
        Statement sql_stmt=null;
        ResultSet records=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_list","root","Iforgot#6");
            sql_stmt = mycon.createStatement();  
            records = sql_stmt.executeQuery("select * from products");
            
            out2.println("<html><head><title>Product List</title>"
            		+ "<style>\r\n"
            		+ ".center {\r\n"
            		+ "			position: relative;\r\n"
            		+ "			text-align: center;\r\n"
            		+ "			margin-left: auto;\r\n"
            		+ "			margin-right: auto;\r\n"
            		+ "		}"
            		+ "		button{\r\n"
            		+ "            background-color: cornflowerblue;\r\n"
            		+ "            color: rgb(0, 0, 0);\r\n"
            		+ "            padding: 10px 20px;\r\n"
            		+ "            text-decoration: none;\r\n"
            		+ "            border-radius: 20px;\r\n"
            		+ "            transition: background-color 0.3s ease;    \r\n"
            		+ "        }\r\n"
            		+ "        \r\n"
            		+ "        button:hover{\r\n"
            		+ "            background-color: rgb(255, 255, 255);\r\n"
            		+ "        }\r\n"
            		+ "</style>"
            		+ "</head><body style=\"background-color:#99ccff;\">");
            out2.print("<div class=\"center\"><h1>" + "Edit Coins" + "</h1></div>");
            out2.println("<table border='0' width='100%' cellpadding='6'>");
            
            out2.println("<tr>");
            out2.println("<th>Picture</th>");
            out2.println("<th>Product Name</th>");
            out2.println("<th>Product Description</th>");
            out2.println("<th>Price</th>");
            out2.println("<th>Product ID</th>");
            out2.println("<th>Quantity</th>");
            
            
            //for adding new coin
            out2.println("<tr>");
            out2.println("<form action='page3.jsp' method='post'>");
            out2.println("<button>Add New Coin"); 
            out2.println("</form>");
            out2.println("</tr>");
            
            out2.println("</tr>");
            //List<row> productList=productTable.getProductTable();
            while (records.next()) {
            	out2.println("<form action='page2.jsp' method='post'>");
            	out2.print("<tr>");
            	out2.println("<td>"+"<button><img src=\""+records.getString("image")+ "\" name='pic' style=\"width:200px\">"+"</td>");
                out2.print("<td>"+records.getString("name")+"</td>");
                out2.print("<td>"+records.getString("description")+"</td>");
                out2.print("<td>"+"$"+records.getString("price")+"</td>");
                out2.print("<td>"+records.getString("pid")+"</td>");
                out2.print("<td>"+records.getString("qty_available")+"</td>");
                out2.print("</tr>");
                
                out2.println("<input type='hidden' name='pid' value='"+records.getString("pid")+"'/>");
                out2.println("<input type='hidden' name='pic' value='"+records.getString("image")+"'/>");
                out2.println("<input type='hidden' name='coinName' value='"+ records.getString("name")+"'/>");
                out2.println("<input type='hidden' name='coinDesc' value='"+records.getString("description")+"'/>");
                out2.println("<input type='hidden' name='customerPrice' value='"+records.getString("price")+"'/>");
                out2.println("<input type='hidden' name='qty' value='"+records.getString("qty_available")+"'/>");
                
                
                
                out2.println("</form>");
            }
            out2.print("</table>");
            
            out2.print("<br/><br/>");
            out2.println("<div class=\"center\"><form action='admin.html'>");
            out2.println("<button>Back to Admin Menu"); 
            out2.println("</form></div>");
           
        }
        
        
        catch(Exception e) {e.printStackTrace();}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
