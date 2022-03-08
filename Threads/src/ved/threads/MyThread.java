package ved.threads;

class MyThread extends Thread {
	/*public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread x = new Thread(t);
		x.start();
	}

	public void run() {
		for (int i = 0; i < 3; ++i) {
			System.out.print(i + "..");
		}
	}*/
	
	//Exp:5
	/*public static void main(String[] args) {
		System.out.print("1 ");
		synchronized (args) {
			System.out.print("2 ");
			try {
				args.wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.print("3 ");
	}*/
	
	//Exp:9
	public static synchronized void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		t.start();
		
		System.out.print("X");
		synchronized (t) {
			t.wait(10000);
		}
		System.out.print("Y");
	}
}