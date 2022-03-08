package MyNumbers;
import javax.servlet.http.*;
import org.apache.struts.action.*;
public final class InputNumbersAction 
				extends Action  
{
	  public ActionForward execute(ActionMapping mapping,
		      ActionForm form,
		      HttpServletRequest request,
		      HttpServletResponse response) 
	    throws Exception
	  {
		  	// Take the action form object which is
		  	// the representation of the JSP file data
		  	InputNumbersForm f = (InputNumbersForm) form;
		  	// Call the form object to get the number entered
		    int intNumber = f.getintNumber();
		    // Call the model class numbertowords to convert the
		    // number to words
		    NumberToWords objnumbertoword = new NumberToWords();
		    String strNumber = objnumbertoword.GetWords(intNumber);
		    // Finally set the string back to the action form object
		    f.setstrNumber(strNumber);
		    // and redirect the user to the same page.
		    //See how the success is mapped in the struts-config file.
		    return (mapping.findForward("success"));
		  }
	  


}
