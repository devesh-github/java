public class clsThreadRunnable implements Runnable 
{ 
    String str; 
    public clsThreadRunnable(String strval)
    { 
        str = strval; 
    } 
    public void run()
    { 
        System.out.println( str ); 
    } 
    public static void main( String[] args )
    { 
        clsThreadRunnable threadedClass1 = new clsThreadRunnable("Thread1"); 
        Thread t1 = new Thread(threadedClass1);
        t1.start();
        
        clsThreadRunnable threadedClass2 = new clsThreadRunnable("Thread2"); 
        Thread t2 = new Thread(threadedClass2);
        t2.start();
    } 
}
