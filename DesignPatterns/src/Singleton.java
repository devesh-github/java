
public class Singleton {

	protected Singleton(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	protected Singleton(){
	}

	public static Singleton instance;
	public String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer id;
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;		
	}
	
	public static void main(String[] args) {
		
		/*Singleton newSingleton = getInstance();
		newSingleton.setName("MySIngleton");
		newSingleton.setId(12345);
		
		Singleton secondInstance = getInstance();
		System.out.println(secondInstance.getName() + secondInstance.getId());
		
		Singleton thirdInstance = getInstance();
		thirdInstance.setName("MyChangedSIngleton");
		thirdInstance.setId(6789);
		System.out.println(secondInstance.getName() + secondInstance.getId());*/
		
		//Singleton.instance = new Singleton();
		Singleton newInstance = new Singleton("a",123);
		System.out.println(newInstance.getName() + newInstance.getId());
	}
}
