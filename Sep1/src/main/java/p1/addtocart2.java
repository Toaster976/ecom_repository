package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class addtocart
 */
@WebServlet("/addtocart2")
public class addtocart2 extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addtocart2() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        HttpSession session=request.getSession();
        ArrayList previousProducts=(ArrayList)session.getAttribute("previousProducts");
        PrintWriter out=response.getWriter();
        if(previousProducts==null) {
            previousProducts=new ArrayList();
            session.setAttribute("previousProducts", previousProducts);
        }
        String newProdID=request.getParameter("productid");
        if(newProdID!=null)
        {
            previousProducts.add(newProdID);
            
        }
        
        out.println("<html><head><title>ADD to Cart</title></head><body>");
        if(previousProducts.size()==0) {
            out.println("<h2>Empty Cart!</h2>");
            
        }
        else {
            out.println("<table border='1'>");
            for(int i=0; i<previousProducts.size(); i++) {
                out.println("<tr><td>"+previousProducts.get(i)+"</tr></td>");
            }
            out.println("</table>");
        }
         
        out.println("<p>you have add to the cart:"+request.getParameter("productid")+"</p>");
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