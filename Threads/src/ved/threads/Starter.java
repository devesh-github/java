package ved.threads;

public class Starter implements Runnable {
	void go(long id) {
		System.out.println(id);
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getId() + " ");
		// insert code here
		//new Starter().run(); //1,1
		//new Starter().start(); //compilation error
		//new Thread(new Starter());
		//new Thread(new Starter()).run(); //1 1
		new Thread(new Starter()).start(); //1 8
	}

	public void run() {
		System.out.println("i m in run method");
		go(Thread.currentThread().getId());
	}
}