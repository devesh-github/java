import java.util.*;
public class clsMain 
{
	public static void main(String[] args) 
	{
		
		TreeSet ts = new TreeSet(new clsComparator());
		ts.add("ShivXXXX");
		ts.add("ShivXXXXXXX");
		ts.add("ShivXXXXX");
		ts.add("ShivXXXXXX");
		Iterator i = ts.iterator();
		while(i.hasNext())
		{
		Object el = i.next();
		System.out.println(el +"");
		}
}}

