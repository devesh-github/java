
public class ClsRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Create object of the parent class
		ClsAdd objClsAdd = new ClsAdd();
		System.out.println("Simple addition :- " + objClsAdd.Add(2,3));
		// Create object of child class 
		ClsSpecialAdd objClsSpecialAdd = new ClsSpecialAdd();
		System.out.println("Special addition :- " + objClsSpecialAdd.Add(2,3));
		
	}

}
