package com.ved.assignments;

public class Bridge {
	public enum Suits {
		CLUBS(20), DIAMONDS(20), HEARTS(30), SPADES(30), NOTRUMP(40) {
			public int getValue(int bid) {
				return ((bid - 1) * 30) + 40;
			}
		};
		Suits(int points) {
			this.points = points;
		}

		private int points;

		public int getValue(int bid) {
			System.out.print( points + " "+ bid + " ");
			return points * bid;
		}
	}

	public static void main(String[] args) {
		System.out.println(Suits.NOTRUMP.getValue(3));
		System.out.println(Suits.SPADES + " " + Suits.SPADES.points);
		System.out.println(Suits.values());
		
		for (Suits s : Suits.values())
			{System.out.println(s.points);
			System.out.println(s.getValue(2));
			}
	}
}