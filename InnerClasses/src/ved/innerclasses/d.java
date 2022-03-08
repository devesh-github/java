package ved.innerclasses;

class Boo {
	Boo(String s) {
	}

	Boo() {
	}
}

class Bar extends Boo {
	Bar() {
	}

	Bar(String s) {
		super(s);
	}

	void zoo() {
		// insert code here
		//Boo f = new Boo(24) { };
		Boo f = new Bar() { };
		Boo ff = new Boo() {String s; };
		Boo gg = new Boo("PK") { };
		//Bar f = new Boo(String s) { };
		//Boo f = new Boo.Bar(String s) { };
	}
}
