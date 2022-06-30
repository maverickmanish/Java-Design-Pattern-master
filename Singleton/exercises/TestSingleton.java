package exercises;

import exercises.Singleton;

/*
 * This class is test the self created singleton class "Singleton".
 * */
public class TestSingleton {

	public static void main(String[] args) {
		
		Singleton instance = Singleton.getInstance();
		System.out.println(instance);
		
		/*
		 * This is forbidden because of the private constructor. Hence new instance can't be created. 
		 * */
		//Singleton newInstance = new Singleton();
		
		Singleton anotherInstance = Singleton.getInstance();
		System.out.println(anotherInstance);
		
		System.out.println(instance == anotherInstance); // This returns true. Hence Singleton is working perfectly.

	}

}
