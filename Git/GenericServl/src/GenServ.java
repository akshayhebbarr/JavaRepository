import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class GenServ extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<i>This is Generic Servlet</i>");
		out.print("<b>GoodBye</b>");
	}
}