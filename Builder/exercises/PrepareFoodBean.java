package exercises;

/**
 * 
 * @author darpanbora
 * This is an example class of JavaBean Pattern.
 */
public class PrepareFoodBean {

	private String bread;
	private String veggies;
	private String sauces;
	private String meat;
	
	public PrepareFoodBean() {
		
	}
	
	public void setBread(String bread) {
		 this.bread = bread;
	}
	
	public void setVeggies(String veggies) {
		 this.veggies = veggies;
	}
	
	public void setSauces(String sauces) {
		this.sauces = sauces;
	}
	
	public void setMeat(String meat) {
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
