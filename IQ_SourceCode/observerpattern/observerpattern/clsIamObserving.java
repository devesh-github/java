import java.util.Observable;
import java.util.Observer;

public class clsIamObserving
		implements Observer
{
	public void update(Observable obj, Object arg)
	{
		String str;
		str = (String) arg;
		System.out.println(str);
	}
}
