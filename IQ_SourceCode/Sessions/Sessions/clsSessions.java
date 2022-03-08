import java.io.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;

public class clsSessions extends HttpServlet 
{
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException 
{
	HttpSession presentSession = request.getSession(true);
	
	String strName = (String)presentSession.getAttribute("Name");
	
	PrintWriter objWriter = response.getWriter();
	
	if (strName == null)
	{	
		objWriter.println(" Inserted first time in to session");
		
		String strobj = new String("Data from Session");
		
		presentSession.setAttribute("Name", strobj);
		
		strName = strobj;
		
	}
	
	
	objWriter.println(" Taken from session variable");
	objWriter.println(" Name = " + strName);
	
	
	
	
}

}