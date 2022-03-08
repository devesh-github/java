
public class clsRun 
{
	public static void main(String[] args) 
	{
		clsMale objclsMale = new clsMale();
		clsFemale objclsFemale = new clsFemale();
		
		System.out.println("-------------------");
		objclsMale.numberOfEyes();
		objclsMale.numberOfLegs();
		objclsMale.Sex();
		System.out.println("-------------------");
		objclsFemale.numberOfEyes();
		objclsFemale.numberOfLegs();
		objclsFemale.Sex();
		System.out.println("-------------------");
	}

}
