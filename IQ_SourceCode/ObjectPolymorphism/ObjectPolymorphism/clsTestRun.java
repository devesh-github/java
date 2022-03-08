
public class clsTestRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 
		// Create object of the parent class
		ClsAdd objClsAddParent = new ClsAdd();
		// Create object of the special add class
		ClsSpecialAdd objClsSpecialAdd = new ClsSpecialAdd();
		// Create object of the add and divide class
		ClsSpecialAddAndDivide objClsSpecialAddAndDivide = new ClsSpecialAddAndDivide();
		
		// call the parent object
		System.out.println("Simple addition :- " + objClsAddParent.Add(2,3));
		// set the parent object to the child special add and call the
		// add method
		objClsAddParent = objClsSpecialAdd;
		System.out.println("Special addition :- " + objClsAddParent.Add(2,3));
		
		// set the parent object to the child special add and divide class 
		// and call the add method
		objClsAddParent = objClsSpecialAddAndDivide;
		System.out.println("Special addition :- " + objClsAddParent.Add(6,6));
	}

}
