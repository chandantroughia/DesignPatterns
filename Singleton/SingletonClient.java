package Singleton;

public class SingletonClient {
	
	public static void main(String[] args) {
		
		SingletonClass object = SingletonClass.getInstance();
		object.message();
		
	}

}
