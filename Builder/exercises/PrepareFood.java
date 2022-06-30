package exercises;

/**
 * 
 * @author mbhardw
 * This is an example class of Builder Design Pattern. 
 */
public class PrepareFood {

	public static class Builder {
		
		private String bread;
		private String veggies;
		private String sauces;
		private String meat;
		
		public Builder() {
			
		}
		
		public PrepareFood build() {
			return new PrepareFood(this);
		}
		
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}
		
		public Builder veggies(String veggies) {
			this.veggies = veggies;
			return this;
		}
		
		public Builder sauces(String sauces) {
			this.sauces = sauces;
			return this;
		}
		
		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
	}
	
	private final String bread;
	private final String veggies;
	private final String sauces;
	private final String meat;
	
	private PrepareFood(Builder builder) {
		this.bread = builder.bread;
		this.veggies = builder.veggies;
		this.sauces = builder.sauces;
		this.meat = builder.meat;
		
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
