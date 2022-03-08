package com.ved.assignments;

class Alien {
	String invade(short ships) {
		return "a few";
	}

	String invade(short... ships) {
		return "many";
	}
}

class Defender {
	public static void main(String[] args) {
		//System.out.println(new Alien().invade(7));
		System.out.println(new Alien().invade((short)7));
	}
}