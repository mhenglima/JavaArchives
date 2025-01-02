
/* This is the example found in the lecture */

import java.util.ArrayList;
public class SimpleArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Ben");
		names.add("Cat");
		names.add(0, "Amy"); // Add to ArrayList at a specified location
		
		System.out.println(names.indexOf("Ben"));
		
		System.out.println(names);

	}

}
