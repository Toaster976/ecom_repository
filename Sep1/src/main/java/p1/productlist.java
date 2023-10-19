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
 * Servlet implementation class connectDB
 */
@WebServlet("/connectDB")
public class productlist extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productlist() {
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
                mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","cba321");
                sql_stmt = mycon.createStatement();  
                records = sql_stmt.executeQuery("select * from product");
                out2.println("<html><head><title>Query Results</title></head><body>");
                out2.println("<table border='1' cellpadding='6'>");
                   out2.println("<tr>");
                   
                   out2.println("<th>Product ID</th>");
                   out2.println("<th>Product Name</th>");
                   out2.println("<th>Product Description</th>");
                                     out2.println("</tr>");
                while (records.next()) {
                    do {
                       
                        out2.println("<tr>");
                        out2.println("<td>" + records.getString("productID") + "</td>");
                        out2.println("<td>" + records.getString("productName")+ "</td>");
                        out2.println("<td>" + records.getString("productName") + "</td>");
                        
                        out2.println("</tr>");
                     } while (records.next());
                     out2.println("</table><br />");
                   // out2.print("<br>"+records.getString("productID")+", "+records.getString("productName")+records.getString("productName"));
                }
            }
            
               
            
            catch(Exception e) {e.printStackTrace();} 
        }
}