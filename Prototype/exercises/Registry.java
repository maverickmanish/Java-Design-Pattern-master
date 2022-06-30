package exercises;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<String, Item> items = new HashMap<String, Item>();
	
	public Registry() {
		loadItems();
	}
	
	public Item createItem (String type) {
		Item item = null;
		try {
			item = (Item)(items.get(type)).clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return item;
	}
	
	private void loadItems() {
		
		Movie movie = new Movie();
		movie.setTitle("Shutter Island");
		movie.setPrice(99.99);
		movie.setRuntime("3 hours");
		items.put("Movie", movie);
		
		Book book = new Book();
		book.setTitle("Rich Dad Poor Dad");
		book.setPrice(159.99);
		book.setNumberOfPages(123);
		items.put("Book",book);
		
	}

}
