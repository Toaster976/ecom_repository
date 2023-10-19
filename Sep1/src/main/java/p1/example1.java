package p1;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class example1
 */
@WebServlet("/example1")
public class example1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public example1() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html");
        HttpSession session=request.getSession();
        String heading; 
        Integer accessCount=(Integer)session.getAttribute("accessCount");
        if(accessCount==null) {
            accessCount=0;
            heading="Welcome, Newcomer";
            
        }else {
            heading="Welcome back!";
            accessCount=accessCount+1;
        }
        session.setAttribute("accessCount", accessCount);
        PrintWriter out3=response.getWriter();
        String title="Session Tracking Example 1";
        out3.println("<html><head><title>"+title+"</title></head><body bcgcolor=\"#FDF5E6\"><center><h1>"+heading+"</h1>");
        out3.println("<h2>Information about your session</h2>");
        out3.println("<table border='1'><tr bcgcolor=\"FFAD00\"><th>Info Type</th><th>Value</th>");
        out3.println("<tr><td>ID</td><td>"+session.getId()+"</td></tr><tr><td>Creation Time</td><td>"+new Date(session.getCreationTime())+"</td></tr>");
        out3.println("<tr><td>Time of Last Access</td><td>"+new Date(session.getLastAccessedTime())+"</td></tr>");
        out3.println("<tr><td>Number of Previous Access</td><td>"+accessCount+"</td></tr>");
        out3.println("</table></center></body></html>");
        
    }
    


    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}