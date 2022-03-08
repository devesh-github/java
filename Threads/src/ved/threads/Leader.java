package ved.threads;

public class Leader implements Runnable {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new Leader());
		t.start();
		System.out.print("m1 ");
		t.join();
		System.out.print("m2 ");
	}

	public void run() {
		System.out.print("r1 ");
		System.out.print("r2 ");
	}
}