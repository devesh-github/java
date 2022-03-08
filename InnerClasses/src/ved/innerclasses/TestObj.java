package ved.innerclasses;

public class TestObj {
	public static void main(String[] args) {
	 Object o = new Object() {
		 public boolean equals(Object obj) {
			 System.out.println("hello der");
		 return true;
		 }
	 };
	 System.out.println(o.equals("Fred"));
	 }
}
