
public class clsThread extends Thread 
{
public String str;
public void run()
{
	for(int i =0;i<=10;i++)
	{
		System.out.println(str);
	}
}
}