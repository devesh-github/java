package ved.innerclasses;

public class HorseTest {
	public static void main(String[] args) {
		class Horse {
			public String name;

			public Horse(String s) {
				name = s;
			}
		}
		Object obj = new Horse("Zippo");
		// System.out.println(obj.name);
	}
}