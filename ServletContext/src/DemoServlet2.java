import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DemoServlet2 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		try{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			ServletContext context=getServletContext();
			String n=(String)context.getAttribute("Car");
			out.println("Welcome to"+" "+n);
			out.close();
		}catch(Exception e)
		{
			PrintWriter out=response.getWriter();
			out.println(e);
		}
	}
}