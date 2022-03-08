
public class clsTestRun {

	/**
	 * @param args
	 * This class runs the clsStaticNonStatic class
	 */
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		clsStaticNonStatic objclsStaticNonStatic1 = new clsStaticNonStatic();
		
		objclsStaticNonStatic1.intNonStat ++;
		objclsStaticNonStatic1.intStat ++;
		System.out.println("object1 intNonStat variable " + objclsStaticNonStatic1.intNonStat );
		System.out.println("object1 intStat variable " + objclsStaticNonStatic1.intStat );
		System.out.println("-----------------------------------------------------------");
		
		clsStaticNonStatic objclsStaticNonStatic2 = new clsStaticNonStatic();
		objclsStaticNonStatic2.intNonStat ++;
		objclsStaticNonStatic2.intStat ++;
		System.out.println("object2 intNonStat variable " + objclsStaticNonStatic2.intNonStat );
		System.out.println("object2 intStat variable " + objclsStaticNonStatic2.intStat );
		System.out.println("-----------------------------------------------------------");
		
		clsStaticNonStatic objclsStaticNonStatic3 = new clsStaticNonStatic();	
		objclsStaticNonStatic3.intNonStat ++;
		objclsStaticNonStatic3.intStat ++;
		System.out.println("object3 intNonStat variable " + objclsStaticNonStatic3.intNonStat );
		System.out.println("object3 intStat variable " + objclsStaticNonStatic3.intStat );
		System.out.println("-----------------------------------------------------------");
		
		clsStaticNonStatic objclsStaticNonStatic4 = new clsStaticNonStatic();
		objclsStaticNonStatic4.intNonStat ++;
		objclsStaticNonStatic4.intStat ++;
		System.out.println("object4 intNonStat variable " + objclsStaticNonStatic4.intNonStat );
		System.out.println("object4 intStat variable " + objclsStaticNonStatic4.intStat );
		System.out.println("-----------------------------------------------------------");
	}
	

}
