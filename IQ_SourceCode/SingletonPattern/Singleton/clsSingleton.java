public class clsSingleton 
{
	public int intcount;
    private clsSingleton() 
    {
    	// define the constructor private so that
    	// no client can create the object this class
    }
    // define the object as static so that only one instance of the object
    // is created
    private static clsSingleton instance = new clsSingleton();
    // define a static method to get the static instance
    public static clsSingleton getInstance() 
    {
    	return instance;
    }
 }
