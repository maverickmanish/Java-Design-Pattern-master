package exercises;

/**
 * Thread Safe instance of a Singleton. 
 * */
public class SingletonThreadSafe {

	private static volatile SingletonThreadSafe instance = null;
	
	private SingletonThreadSafe() {
		if(instance != null) {
			throw new RuntimeException("Use getInstance() method instead!");
		}
	}
	
	public static SingletonThreadSafe getInstance() {
		if(instance == null) {
			synchronized(SingletonThreadSafe.class) {
				if(instance == null) {
					instance = new SingletonThreadSafe();
				}
			}
		}
		return instance;
	}
}
