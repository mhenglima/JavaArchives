
/* This is the addStars exercise from the lecture */

import java.util.ArrayList;
public class ArrayListExercise {
	
	/* Create the addStars method which will insert * after every element in a specified ArrayList */
	public static void addStars(ArrayList<String> myList) {

		/*
		   This loop will keep adding * into the specified ArrayList while i <= the size of the ArrayList.
		   i is also the index where the * will be inserted in the ArrayList.
		*/
		
		for(int i = 1; i <= myList.size(); i += 2)
			myList.add(i, "*");
			
	}
	
	public static void main(String[] args) {
		
		// ArrayList myList is instantiated.
		ArrayList<String> myList = new ArrayList<String>();
		
		// The following elements are inserted in to the ArrayList.
		myList.add("the");
		myList.add("quick");
		myList.add("brown");
		myList.add("fox");

		// The addStars method is called and myList is the ArrayList that will be used.
		addStars(myList);
		
		System.out.println(myList);

	}

}










/*

*/