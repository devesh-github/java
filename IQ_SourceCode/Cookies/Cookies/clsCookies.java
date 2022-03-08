import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class clsCookies
 extends HttpServlet
 implements Servlet
{
 public void doGet(
  HttpServletRequest request,
  HttpServletResponse response)
  throws ServletException, IOException
 {
  // get the cookies value in string variable
  String strfavoritebook =  request.getParameter("BooksPreference");
  // create a new cookie with the value passed
  Cookie favoritecookiebook =  new Cookie("favoritecookiebook", strfavoritebook);
  // Add a simple comment
  favoritecookiebook.setComment("User prefers this");
  // add the cookies to the response object
  response.addCookie(favoritecookiebook);
  // by default there us nothing selected
  String result = "still not selected";
  if (request.getCookies()!= null)
  {
  Cookie[] cookies = request.getCookies();
  // Loop through all the cookies and get the cookies value 
  for(int i = 0;i < cookies.length;i++)
  {
    if(cookies[i].getName().equals("favoritecookiebook"))
    {
      result = cookies[i].getValue();
      break;
    }}}
  // Finally using printwriter object to write the cookies back to the browse
  PrintWriter out =  response.getWriter();
  out.println("" + "");
  // and display the out put
  out.println("<H2> So your favourite book is " + result  + " </H2>");
  out.println("");
 }
 

 public void doPost(
  HttpServletRequest request,
  HttpServletResponse response)
  throws ServletException, IOException
 {
  doGet(request, response);
 }
}
