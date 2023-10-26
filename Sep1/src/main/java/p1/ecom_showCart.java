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
 * Servlet implementation class showShopCart
 */
@WebServlet("/ecom_showCart")
public class ecom_showCart extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ecom_showCart() {
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
		out2.println("<html><head><title>Shopping Cart</title></head><body>");
		out2.println("<table border='1' width='100%' cellpadding='6'>");
		out2.println("<tr>");
		out2.println("<th>&nbsp</th>");
		out2.println("<th>Product ID</th>");
		out2.println("<th>Picture</th>");
		out2.println("<th>Product Name</th>");
		out2.println("<th>Product Description</th>");
		out2.println("<th>Price</th>");
		out2.println("<th>Quantity</th>");
		out2.println("</tr>");
		HttpSession session=request.getSession();
		ArrayList<row> shopCart=(ArrayList)session.getAttribute("sCart");
		
		if(shopCart==null)
			out2.println("<p>Empty Shop Cart!</p>");
		else
		{
			for(row r:shopCart) {
				out2.println("<tr>");
				out2.println("<td>"+"</td>");
				out2.println("<td>"+r.get_product_id()+"</td>");
				out2.println("<td>"+"<img src=\"" + r.get_image() + "\" style=\"width:200px\">"+"</td>");
				out2.println("<td>"+r.get_product_name()+"</td>");
				out2.println("<td>"+r.get_product_desc()+"</td>");
				out2.println("<td>"+r.get_product_price()+"</td>");
				out2.println("<td>"+r.get_qty()+"</td>");
				out2.println("</tr>");
			}
		}
		out2.println("</table><br />");
	}
	/**
	* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}