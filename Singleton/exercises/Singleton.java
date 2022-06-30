package exercises;

/**
 * @author darpanbora
 * In this code, we try to create a singleton class of our own and name it "Singleton". 
 * We'll also create another class "testDbSingleton" to check it. 
 */

public class Singleton {

	private static Singleton instance = new Singleton();
	
	// Private Constructors will not allowed to create new instances of this class.
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
	
}
