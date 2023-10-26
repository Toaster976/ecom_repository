package p1;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class productList
 */
@WebServlet("/productList3")
public class productList3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public productList3() {
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
		out2.println("<html><head><title>Query Results</title></head><body>");
		out2.println("<table border='1' width='100%' cellpadding='6'>");
		out2.println("<tr>");
		out2.println("<th>&nbsp</th>");
		out2.println("<th>Product ID</th>");
		out2.println("<th>Product Name</th>");
		out2.println("<th>Product Description</th>");
		out2.println("<th>picture</th>");
		out2.println("</tr>");
		List<row> productList=productTable.getProductTable();
		for(int i=0; i<productList.size(); i++) {
			out2.println("<form action='pag1.jsp' method='post'>");
			out2.println("<tr>");
			out2.println("<td></td>");
			out2.println("<input type='hidden' name='productid' value='"+productList.get(i).getProductID()+"'/>");
			out2.println("<input type='hidden' name='productName' value='"+ productList.get(i).getProductName()+"'/>");
			out2.println("<input type='hidden' name='productDesc' value='"+productList.get(i).getProductDesc()+"'/>");
			out2.println("<input type='hidden' name='pic' value='"+productList.get(i).getPic()+"'/>");
			out2.println("<input type='hidden' name='customerPrice' value='"+productList.get(i).getCustomerPrice()+"'/>");
			out2.println("<input type='hidden' name='qtyOrder' value='1'/>");
			out2.println("<td>" + productList.get(i).getProductID() + "</td>");
			out2.println("<td>" + productList.get(i).getProductName()+ "</td>");
			out2.println("<td>" + productList.get(i).getProductDesc() + "</td>");
			out2.println("<td>"+"<button><img src='pics/"+productList.get(i).getPic()+ "' style='width:200px;'></button>"+"</td>");
			out2.println("</tr>");
			out2.println("</form>");
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
