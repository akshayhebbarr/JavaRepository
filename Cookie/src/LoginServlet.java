import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		String name=request.getParameter("name");
		String password=request.getParameter("pwd");
		if(name.equals("Akshay")&&password.equals("qwerty"))
		{
			out.print("Welcome, you are logged in");
			out.println("<br>Welcome"+" "+name);
			Cookie ck=new Cookie("name",name);
			response.addCookie(ck);
		}else
		{
			out.print("Invalid User");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		out.close();
	}
}