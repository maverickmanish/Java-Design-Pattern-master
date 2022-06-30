package exercises;

/**
 * @author mbhardw
 * In this code, we try to create a singleton class of our own and name it "SingletonLazyLoading" 
 * along with implementing lazy loading technique. 
 * One of the form of lazy loading is infinite scroll which only loads data as users scroll down
 * the page, instead of loading everything at once. 
 */
public class SingletonLazyLoading {

	private static SingletonLazyLoading instance = null;
	
	// Private Constructors will not allowed to create new instances of this class.
	private SingletonLazyLoading() {}
	
	public static SingletonLazyLoading getInstance() {
		// Here we are implementing the lazy loading technique. Instead of creating the instance in the beginning,
		// we are creating it, when it is required. This helps in optimizing any application. 
		if(instance == null) {
			instance = new SingletonLazyLoading();			
		}
		return instance;
	}
}
