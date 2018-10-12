import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DemoServlet1 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		try{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			ServletContext context=getServletContext();
			context.setAttribute("Car", "BMW");
			out.println("Welcome to first Servlet");
			out.println("<a href='servlet2'>click here</a>");
			out.close();
		}catch(Exception e)
		{
			PrintWriter out=response.getWriter();
			out.println(e);
		}
	}
}