class clsChained 
{
static void demo() 
{
// create an exception
NullPointerException nullerror = new NullPointerException("First layer");
// add a cause
nullerror.initCause(new ArithmeticException("Arthimetic"));
throw nullerror;
}
   
public static void main(String args[]) 
{
    try 
    {
    	demo();
    } 
    
    catch(NullPointerException e) 
    {
      // display First layer exception
      System.out.println("Caught: " + e);
   
      // Display the cause of exception
      System.out.println("Original cause: " + e.getCause());
    }}

}
