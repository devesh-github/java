package ved.colleaction;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class ClientSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Ascending Order
		Set set = new TreeSet();
		
		//Unpredictable Order, doesn't maintains the order of insertion
		//Set set = new HashSet();
		
		//Ordered HashSet, maintains the order of insertion
		//Set set = new LinkedHashSet();
		
		set.add("2");
		set.add("3");
		set.add("1");
		set.add("9");
		
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next() + "");
		}

	}

}
