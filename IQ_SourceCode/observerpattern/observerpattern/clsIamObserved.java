import java.util.Observable;

public class clsIamObserved extends Observable
{
	public void TryingtoSteal()
	{
		setChanged();
		notifyObservers(new String("Trying to steal"));
	}
}
