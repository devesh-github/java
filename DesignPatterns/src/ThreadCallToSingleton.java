
class ThreadCallToSingleton {

	public static void main(String[] args) {
		FirstThreadCallToSingleton firstThread = new FirstThreadCallToSingleton();
		firstThread.run();
		
		SecondThreadCallToSingleton secondThread = new SecondThreadCallToSingleton();
		secondThread.run();	
	}
}


class FirstThreadCallToSingleton implements Runnable{

	@Override
	public void run() {
		Singleton newSingleton = Singleton.getInstance();
		newSingleton.setName("MySIngleton");
		newSingleton.setId(12345);
		System.out.println(newSingleton.getName() + newSingleton.getId());
		
		Singleton secondInstance = Singleton.getInstance();
		secondInstance.setName("MySecondSIngleton");
		secondInstance.setId(34567);		
		System.out.println(secondInstance.getName() + secondInstance.getId());
	}
}

class SecondThreadCallToSingleton extends Thread{

	@Override
	public void run() {
		Singleton thirdInstance = Singleton.getInstance();
		Singleton testPrivateInstance = new Singleton();
		//thirdInstance.setName("MyChangedSIngleton");
		//thirdInstance.setId(6789);
		System.out.println(thirdInstance.getName() + thirdInstance.getId());
	}
}
