package examples;

public class BuilderStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("StringBuilder is an example of builder pattern.");
		
		stringBuilder.append("Also, this performs better than the string's concat() method or concatenating strings using '+'.");
		
		//Can append integers as well
		stringBuilder.append(100);
		
		System.out.println(stringBuilder.toString());
	}
}
