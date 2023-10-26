package p1;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class saveCustomerInfo
 */
@WebServlet("/saveCustomerInfo")
public class saveCustomerInfo extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public saveCustomerInfo() {
        super();
        // TODO Auto-generated constructor stub
    }
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doPost(request, response);
}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
Connection mycon=null;
//ResultSet records=null;
try {
Class.forName("com.mysql.cj.jdbc.Driver");
mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","cba321");
response.setContentType("text/html");
PrintWriter out=response.getWriter();
PreparedStatement preSqlStmt=mycon.prepareStatement("Insert into customer values(?,?,?,?)");
preSqlStmt.setString(1,request.getParameter("customerID")); //preSqlStmt.setInt(1,orderNo);
preSqlStmt.setString(2,request.getParameter("customerName"));
preSqlStmt.setString(3,request.getParameter("customerAddress"));
preSqlStmt.setInt(4,Integer.parseInt(request.getParameter("cardID")));
int x=preSqlStmt.executeUpdate();
mycon.close();
if(x>0)
{
RequestDispatcher rd = getServletContext().getRequestDispatcher("/saveOrder");
rd.forward(request, response);
}
}
catch(Exception e) {e.printStackTrace();} 
}
}
