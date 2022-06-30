package examples;

import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = new Integer[] {1,2,3};
		
		List<Integer> list = Arrays.asList(array);
		
		System.out.println(array);
		
		System.out.println(list);
	}

}
