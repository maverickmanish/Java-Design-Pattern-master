package exercises;

/**
 * 
 * @author darpanbora
 * 
 * This is an example of Telescoping Constructors.
 *
 */
public class PrepareFoodTC {

	private String bread;
	private String veggies;
	private String sauces;
	private String meat;
	
	public PrepareFoodTC(String bread) {
		this.bread = bread;
	}
	
	public PrepareFoodTC(String bread, String veggies) {
		this(bread);
		this.veggies = veggies;
	}
	
	public PrepareFoodTC(String bread, String veggies, String sauces) {
		this(bread, veggies);
		this.sauces = sauces;
	}
	
	public PrepareFoodTC(String bread, String veggies, String sauces, String meat) {
		this(bread, veggies, sauces);
		this.meat = meat;
	}
	
	public String getBread() {
		return bread;
	}
	
	public String getVeggies() {
		return veggies;
	}
	
	public String getSauces() {
		return sauces;
	}
	
	public String getMeat() {
		return meat;
	}
}
