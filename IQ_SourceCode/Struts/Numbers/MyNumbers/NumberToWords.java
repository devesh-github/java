package MyNumbers;
import java.util.ArrayList;
public class NumberToWords{
ArrayList resultList = new ArrayList();
	// Fill all the numbers in to a arraylist with.
	// corresponding word mapping
	public NumberToWords()
	{	resultList.add(new String("Zero"));
		resultList.add(new String("One"));
		resultList.add(new String("Two"));
		resultList.add(new String("Three"));
		resultList.add(new String("Four"));
		resultList.add(new String("Five"));
		resultList.add(new String("Six"));
		resultList.add(new String("Seven"));
		resultList.add(new String("Eight"));
		resultList.add(new String("Nine"));
		resultList.add(new String("Ten"));}
	// Lookup function which return the word 
	public String GetWords(int intnumber)
	{	String strRet = "";
		try
		{strRet = resultList.get(intnumber).toString();}
		catch(IndexOutOfBoundsException ex)
		{strRet = "Numbers are only till Ten";}
		return strRet;}}
