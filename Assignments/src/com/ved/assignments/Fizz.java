package com.ved.assignments;

class Fizz {
	int x = 5;

	public static void main(String[] args) {
		final Fizz f1 = new Fizz();
		Fizz f2 = new Fizz();
		Fizz f3 = FizzSwitch(f1, f2);
		System.out.println("f1:"+f1);
		System.out.println("f2:"+f2);
		System.out.println("f3:"+f3);
		//System.out.println("z:"+z);
		System.out.println((f1 == f3) + " " + (f1.x == f3.x));
	}

	@Override
	public String toString() {
		return "Fizz [x=" + x + "]";
	}

	static Fizz FizzSwitch(Fizz x, Fizz y) {
		final Fizz z = x;
		z.x = 6;
		return z;
	}
}