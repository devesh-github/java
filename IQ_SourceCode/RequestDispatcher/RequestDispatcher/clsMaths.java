import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import java.io.*;
public class clsMaths extends HttpServlet
{
	public void service(HttpServletRequest request,
	HttpServletResponse response)
	throws ServletException, IOException
	{
	RequestDispatcher dispatch;
	String strWhattoDo = request.getParameter("Whattodo");

	if (strWhattoDo == "A")
	{
	dispatch =	getServletContext().getRequestDispatcher("/servlet/clsAdd");
	}
	else
	{
	dispatch =	getServletContext().getRequestDispatcher("/servlet/clsMultiply");
	}
	if (dispatch == null)
	{
	response.sendError(response.SC_NO_CONTENT);
	return;
	}
	HttpSession session = request.getSession();
	dispatch.forward(request, response);

	}
	}

