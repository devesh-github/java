import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.*;
import java.io.*;
public class clsMultiply extends HttpServlet
{
	public void service( HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException
	{
	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();

	int Num1 = Integer.parseInt(request.getParameter("Num1"));
	int Num2 = Integer.parseInt(request.getParameter("Num2"));
	int Result = Num1 * Num2;
	pw.println("<html><body>\n");
	pw.println("<B> The Multiplication of " + Num1 + " and "	+ Num2 + " = " + Result);
	pw.println("</B></body></html>");
	pw.close();
	}
	}