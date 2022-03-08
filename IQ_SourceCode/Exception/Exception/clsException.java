import java.lang.*;
public class clsException 
{	
	public static void main(String[] args) 
	{
		try
		{
			int i = 1/0;
			throw new Exception("My exception");
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			
		}
		finally
		{
			System.out.println("Executing Finally");
		}
	}

}
