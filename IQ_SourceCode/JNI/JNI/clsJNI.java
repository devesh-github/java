public class clsJNI 
{
    public native int addTwoNumbers(int one, int two);
    
    static 
	{
        System.loadLibrary("JNILibrary");
    }
    
  	public static void main(String args[])
  	{
  		clsJNI client = new clsJNI();
  		int num1, num2;
  		num1 = 5;
  		num2 = 100;
  		System.out.println(num1 + " + " + num2 + " = " + 
  				client.addTwoNumbers(num1, num2));
  	}
    
}

