
public class ClsRun 
{
 	public static void main(String[] args) 
	{
		int intNumbers[] = {1,2};
		displayString(" Displaying Numbers using IF Statements ");
		
		for (int i=0;i < intNumbers.length+1;i++)
		{
			if (i==1)
			{
				displayString(" One ");
			}
			else if(i==2)
			{
				displayString(" Two ");
			}
		}
		displayString(" Displaying Numbers using SWITCH / CASE Statements ");
		for (int i=0;i < intNumbers.length+1;i++)
		{
			switch(i) 
			{
	        case 1:
	        	displayString("One");
	        	break;
	        case 2:
	        	displayString("Two");
	        	break;
			}
		}
		
	}
		 
	private static void displayString(String str)
	{System.out.println(str);}
}