public class clsMain 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		clsSingleton objclsSingleton;
		objclsSingleton =  clsSingleton.getInstance();
		objclsSingleton.intcount++;
		System.out.println(objclsSingleton.intcount);
	}

}
