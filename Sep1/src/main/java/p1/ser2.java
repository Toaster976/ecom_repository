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
 * Servlet implementation class ser2
 */
@WebServlet("/ser2")
public class ser2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ser2() {
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
             mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","Iforgot#6");
             sql_stmt = mycon.createStatement();  
             records = sql_stmt.executeQuery("select * from student");
             while (records.next()) {
                 out2.print("<br>"+records.getString("st900")+", "+records.getString("stname")+records.getString("email"));
             }
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
