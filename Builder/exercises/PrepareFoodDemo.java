package exercises;

/**
 * 
 * @author mbhardw
 * This class calls the PrepareFood Builder class.
 */
public class PrepareFoodDemo {

	public static void main(String[] args) {
		
		PrepareFood.Builder builder = new PrepareFood.Builder();
		
		builder.bread("Brown").veggies("Tomatoes").sauces("Ketchup").meat("Chicken");
		
		//This is also valid. 
		//builder.bread("Brown").sauces("Ketchup").meat("Chicken");
		
		PrepareFood sandwich = builder.build();
		
		System.out.println(sandwich.getBread());
		System.out.println(sandwich.getVeggies());
		System.out.println(sandwich.getSauces());
		System.out.println(sandwich.getMeat());
	}
}
