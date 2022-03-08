package ved.colleaction;

import java.util.HashMap;
import java.util.Map;


class ToDos {
	String day;
	ToDos(String d) { 
		day = d;
		System.out.println("day : "+day);
	}
	public boolean equals(Object o) {
		System.out.println("Inside equals : ((ToDos)o).day : "+((ToDos)o).day);
		System.out.println("Inside equals : this.day : "+this.day);
		boolean b = (((ToDos)o).day == this.day);
		System.out.println("Inside equals : "+b);
		return ((ToDos)o).day == this.day;
	}
	public int hashCode() { 
		System.out.println("Inside hashCode()");
		return 9;
	}
}

public class ClientMap {

	/**
	 * @param args
	 */
	private Map<String,Integer> accountTotals = new HashMap();
	private int retirementFund;
	
	public int getBalance(String accountName) {
		Integer total = (Integer) accountTotals.get(accountName);
		if (total == null)
		  total = Integer.valueOf(0);
		return total.intValue();
	}
	public void setBalance(String accountName, int amount) {
	 accountTotals.put(accountName, Integer.valueOf(amount));
	}
	
	public static void main(String[] args) {
		/*Map<ToDos, String> m = new HashMap<ToDos, String>();
		System.out.println("Creating Objects");
		ToDos t1 = new ToDos("Monday");
		ToDos t2 = new ToDos("Monday");
		ToDos t3 = new ToDos("Tuesday");
		ToDos t4 = new ToDos("Wednesday");
		ToDos t5 = new ToDos("Thursday");
		System.out.println("Inserting Map elements");
		System.out.println("Inserting Map element t1");
		m.put(t1, "doLaundry");
		System.out.println("Inserting Map element t2");
		m.put(t2, "payBills");
		System.out.println("Inserting Map element t3");
		m.put(t3, "cleanAttic");
		System.out.println("Inserting Map element t4");
		m.put(t4, "experiment");
		System.out.println("Inserting Map element t5");
		m.put(t5, "final");
		System.out.println(m.size());*/
		
		
	}
}

//Conclusion : If the hashCode of two objects (to be inserted in the hasMap) are equal 
//then,the euqals method is taken under consideration.
