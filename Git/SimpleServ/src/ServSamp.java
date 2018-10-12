import java.io.*;
import javax.servlet.*;
public class ServSamp implements Servlet
{
	ServletConfig config=null;
	public void init(ServletConfig config)
	{
		this.config=config;
		System.out.println("Servlet initialized");
	}
	public void service(ServletRequest request,ServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<b>Simple Servlet</b>");
		out.print("</body></html>");
	}
	public void destroy()
	{
		System.out.print("Servlet destroyed");
	}
	public ServletConfig getServletConfig()
	{
		return config;
	}
	public String getServletInfo()
	{
		return "copyright 2018-19";
	}
}