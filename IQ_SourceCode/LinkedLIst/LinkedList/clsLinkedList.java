import java.util.*;
	public class clsLinkedList 
	{
		public static void main(String args[]) 
		{
		LinkedList list1 = new LinkedList();
		list1.add("Shiv");
		list1.add("Raju");
		list1.add("Vishna");
		list1.add("Sanjana");
		list1.add("Simran");
		System.out.println("Contents of the list:" +list1);
		list1.removeLast();
		list1.removeFirst();
		System.out.println("The list after removing the first and last item:" +list1);
		list1.addFirst("Priya");
		System.out.println("Contents of the list after adding:" +list1);
		Object value = list1.get(2);
		list1.set(2,(String)value +" is my wife");
		System.out.println("After alteration " +list1);
		list1.add(2,"Harisingh");
		System.out.println("The list after adding in a specific location:" +list1);
		}
	}

