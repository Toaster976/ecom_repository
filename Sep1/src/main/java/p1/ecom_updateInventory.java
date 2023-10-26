package p1;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class updateStudentTable
 */
@WebServlet("/ecom_updateInventory")
public class ecom_updateInventory extends HttpServlet {
	private static final long serialVersionUID = 1L;
	       
	 
	/**
	* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection mycon2=null;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int x;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			mycon2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_list","root","Iforgot#6");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			PreparedStatement updateStmt = mycon2.prepareStatement("update products set price = ? where pid=?");
			updateStmt.setFloat(1, Float.parseFloat(request.getParameter("product_price")));
			updateStmt.setInt(2, Integer.parseInt(request.getParameter("product_id")));
			if (request.getParameter("product_price") != null) {
				x=updateStmt.executeUpdate();
				if(x>0) {
					out.println("succesfully updated the price");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

