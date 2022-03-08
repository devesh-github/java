import java.io.*;
import java.util.Random;
import javax.servlet.http.*;
import javax.servlet.ServletException;

public class clsUrlRewriting extends HttpServlet 
{
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException 
{
	String strToken = request.getParameter("token");
	
	String urlString = null;
	
	PrintWriter objWriter = response.getWriter();
	
	if (strToken == null)
	{
		Random rand = new Random();
		
		strToken = Long.toString(rand.nextLong());
		
		objWriter.println(" Your new token is :- " + strToken);
		urlString = request.getRequestURL().toString() +  "?token=" + strToken;
		objWriter.println("<a href='" +  urlString + "'> Click here again " + strToken + "</a>");
	}
	else
	{
		urlString = request.getRequestURL().toString() +  "?token=" + strToken;
		objWriter.println("<a href='" +  urlString + "'> Welcome back your token is " + strToken + "</a>");
	}
	
	
}

}