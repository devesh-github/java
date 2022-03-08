package ved.innerclasses;

public class Car {
	 class Engine {
	 // insert code here
		 //{ Car.drive(); }
		 // { this.drive(); }
		  { Car.this.drive(); }
		 // { this.Car.this.drive(); }
		 // Engine() { Car.drive(); }
		 // Engine() { this.drive(); }
		  Engine() { Car.this.drive(); }
	 }
	 public static void main(String[] args) {
	 new Car().go();
	 }
	 void go() {
	 new Engine();
	 }
	 void drive() { System.out.println("hi"); }
	 }