import java.lang.reflect.*;
public class clsDynamicLoading
{
public static void main(String[] args) throws Exception
{
// Load the class
Class toRun = Class.forName("Interview.Questions.Java");
// Call the find main method of the class
Method mainMethod = findMain(toRun);
// Invoke the method
mainMethod.invoke(null, new Object[] { toRun });
}
// This method finds the main method of the class
private static Method findMain(Class clazz) throws Exception
{
	Method[] methods = clazz.getMethods();
	for (int i=0; i<methods.length; i++)
	{
	if (methods[i].getName().equals("main"))
	return methods[i];
	}
	
	return null;
}}
