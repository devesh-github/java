
public class clsTest 
{

	public static void main(String[] args) 
	{
		clsIamObserved objclsIamObserved = new clsIamObserved();
		clsIamObserving objclsIamObserving = new clsIamObserving();
		
		objclsIamObserved.addObserver(objclsIamObserving);
		
		objclsIamObserved.TryingtoSteal();
	}

}
