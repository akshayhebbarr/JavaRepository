import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Servlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String n=request.getParameter("username");
		String p=request.getParameter("userpass");
		if(p.equals("servlet1"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("servlet2");
			rd.forward(request,response);
		}
		else
		{
			out.println("Invalid user");
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	}
}