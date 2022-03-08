package ved.innerclasses;

import java.util.*;

public class Pockets {
	public static void main(String[] args) {
		String[] sa = { "nickel", "button", "key", "lint" };
		//Sorter s = new Pockets().new Sorter();
		Sorter s = new Sorter();
		for (String s2 : sa)
			System.out.print(s2 + " ");
		Arrays.sort(sa, s);
		System.out.println();
		for (String s2 : sa)
			System.out.print(s2 + " ");
	}

	static class Sorter implements Comparator<String> {
		public int compare(String a, String b) {
			return b.compareTo(a);
		}
	}
}