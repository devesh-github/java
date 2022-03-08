package com.ved.assignments;

class Mixer {
	Mixer() {
	}

	Mixer(Mixer m) {
		m1 = m;
	}

	Mixer m1;

	public static void main(String[] args) {
		Mixer m2 = new Mixer();
		System.out.println("m2="+m2);
		Mixer m3 = new Mixer(m2);
		System.out.println("m3="+m3);
		m3.go();
		System.out.println("m3.m1="+m3.m1);
		Mixer m4 = m3.m1;
		System.out.println("m4="+m4);
		m4.go();
		System.out.println("m2.m1 = "+m2.m1);
		Mixer m5 = m2.m1;
		System.out.println("m5="+m5);
		m5.go();
	}

	void go() {
		System.out.println("hi ");
	}
}