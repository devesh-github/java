import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class clsTimeFilter implements Filter
{
	private FilterConfig config = null;

	  public void init(FilterConfig config) throws ServletException 
	  {this.config = config;}

	  public void destroy(){config = null;}

  public void doFilter (ServletRequest request,
              ServletResponse response,
              FilterChain chain) throws IOException, ServletException {
	  // Log the time in a temprorary variable
	  long beforetime = System.currentTimeMillis();
	  // call the invoked the servlet
	    chain.doFilter(request, response);
	   // log the time after the servlet request is finished
	  long aftertime = System.currentTimeMillis();
	  // Get the URL name of the servlet which was invoked
	    String strUrlname = "";
	    if (request instanceof HttpServletRequest) 
	    {
	      strUrlname = ((HttpServletRequest)request).getRequestURI();
	    }
	    // Send the time required to serve the servlets to a LOG file
	    config.getServletContext().log(strUrlname + " was accessed for : " + (aftertime - beforetime) + " Milli Seconds");

  }

  
}

