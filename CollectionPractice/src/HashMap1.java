import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap1 {

	/**
	 * @param args
	 */

	public int id;

	public HashMap1(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	public static void main(String[] args) {

		// Map<String, String> m = new TreeMap<String, String>(); //Maintains
		// sorting
		// Map<String, String> m = new LinkedHashMap<String, String>();
		// //Maintains order
		Map<String, String> m = new HashMap<String, String>(); // Doesn't
																// maintain
																// order
		m.put("4", "abc");
		m.put("1", "abc");
		m.put("2", "abc");

		// System.out.println(m.get("4"));

		ArrayList<HashMap1> al = new ArrayList<HashMap1>();
		al.add(new HashMap1(12));
		al.add(new HashMap1(14));

		/*
		 * for(HashMap1 a:al) { if(a.id>12) al.remove(a); }
		 */

		Iterator it = al.iterator();
		ArrayList<HashMap1> alist = new ArrayList<HashMap1>();
		while (it.hasNext()) {
			HashMap1 a = (HashMap1) it.next();
			if (a.id > 12)
				alist.add(a);
		}

		for (HashMap1 a : alist) {
			al.remove(a);
		}
		System.out.println(al);

	}

}
