package MyNumbers;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.*;
public final class InputNumbersForm extends ActionForm 
{
	private int intNumber;
	private String strNumber;
	
	public int getintNumber() 
	{
		  return (this.intNumber);
	}
	public void setintNumber(int intnumber) 
	{
		this.intNumber = intnumber;
	}
	public String getstrNumber() 
	{
		  return (this.strNumber);
	}
	public void setstrNumber(String strnumber) 
	{
		this.strNumber = strnumber;
	}
}