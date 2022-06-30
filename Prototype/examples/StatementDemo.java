package examples;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author darpanbora
 * This code is an example of Shallow Copy. It sends the references of the arraylist and objects, we passed in. 
 * In case of a deep copy, it would return a new arraylist with the parameters we passed in and a new objects with the values,
 * we passed in. 
 *
 */

public class StatementDemo {

	public static void main(String[] args) {
		
		String sql = "Select * from table_abc";
		
		List<String> parameters = new ArrayList<String>();
		parameters.add("firstName");
		
		Record record = new Record();
		
		Statement first = new Statement(sql, parameters, record);
		
		System.out.println(first.getSql());
		
		System.out.println(first.getParameters());
		
		System.out.println(first.getRecord());
		
		Statement second = first.clone();
		
		System.out.println(second.getSql());
		
		System.out.println(second.getParameters());
		
		System.out.println(second.getRecord());
		
		
	}
}
