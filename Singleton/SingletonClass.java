package Singleton;

public class SingletonClass {
	//make the object that can be used
	private static SingletonClass instance = new SingletonClass();
	
	//Make constructor as private so that the class cannot be instantiated
	private SingletonClass(){};
	
	public static SingletonClass getInstance(){
		return instance;
	}
	
	public void message(){
		System.out.println("Success!");
	}

}
