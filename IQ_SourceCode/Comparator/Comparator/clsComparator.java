import java.util.*;

public class clsComparator 
implements Comparator 
{public int compare(Object arg0, Object arg1) 
{
String str1,str2;
str1 = (String)arg0;
str2 = (String) arg1;

	if (str1.length() < str2.length())
	{
		return 1;
	}
	if (str1.length() > str2.length())
	{return -1;}
	else
	{
		return 0;
	}
}}