package examples;

/**
 * @author mbhardw
 * This code snippet shows that the Runtime.getRuntime() method is a singleton
 */
public class SingletonRuntime {

	public static void main(String[] args) {
		
		Runtime singletonRuntime = Runtime.getRuntime();
		
		//Garbage Collector is called!
		singletonRuntime.gc();
		
		System.out.println(singletonRuntime);
		
		Runtime anotherInstance = Runtime.getRuntime();
		
		System.out.println(anotherInstance);
		
		if(singletonRuntime == anotherInstance) {
			System.out.println("They are the same instance!!");
		}

	}

}
