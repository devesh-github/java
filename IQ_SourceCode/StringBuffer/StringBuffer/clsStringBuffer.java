
public class clsStringBuffer 
{
	public static void main(String[] args) 
	{
		// Using the string object
		String strValue = "Count from 1 to 10 using String"; 
		for (int i=0;i<10;i++)
		{
			strValue = strValue + "\n" + i ;
		}
		System.out.println(strValue);
		
		// Using string buffer object
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("Count from 1 to 10 using StringBuffer");
		for (int i=0;i<10;i++)
		{
			strBuffer.append("\n" + i) ;
		}
		System.out.println(strBuffer);
	}

}