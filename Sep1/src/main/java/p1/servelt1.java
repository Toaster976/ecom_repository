package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servelt1
 */
@WebServlet("/servelt1")
public class servelt1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servelt1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<!DOCTYPE HTML><html>");
        out.println("<head><title>All Parameters</title></head>");
        out.println("<body><h1>Request All Parameters' Names and Values</h1>");
        out.println("<TABLE BORDER=1 ALIGN=CENTER>\n"+"<TR BGCOLOR=\"#FFAD00\">\n");
        out.println("<TH>Parameter Name<TH>Parameter Value(s)");
        Enumeration paramNames = request.getParameterNames();
        while(paramNames.hasMoreElements()) {
          String paramName = (String)paramNames.nextElement();
          out.print("<TR><TD>" + paramName + "\n<TD>");
          String[] paramValues =
            request.getParameterValues(paramName);
          if (paramValues.length == 1) {
            String paramValue = paramValues[0];
            if (paramValue.length() == 0)
              out.println("<I>No Value</I>");
            else
              out.println(paramValue);
          } else {
            out.println("<UL>");
            for(int i=0; i<paramValues.length; i++) {
              out.println("<LI>" + paramValues[i]);
            }
            out.println("</UL>");
          }
        }
        out.println("</TABLE>\n");
        
        out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
