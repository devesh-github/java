public class clsMain 
{
	public static void main(String[] args) 
	{
		clsThread objclsThread1 = new clsThread();
		objclsThread1.str = "Thread1";
		objclsThread1.start();
	
		clsThread objclsThread2 = new clsThread();
		objclsThread2.str= "Thread2";
		objclsThread2.start();
	}

}
