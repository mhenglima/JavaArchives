
/* Driver file for the Book and SchoolBag class */

public class Driver {

	public static void main(String[] args) {
		
		SchoolBag backPack = new SchoolBag(); // Instantiate a SchoolBag as backPack
		Book comic = new Book("Stan Lee", "Spider-Man"); // Instantiate a Book as comic
		Book comic1 = new Book("Stan Lee", "Ghost Rider"); // Instantiate a Book as comic1
		
		backPack.addBook(comic1); // Add comic1 into the backPack
		backPack.addBook(comic); // Add comic into the backPack
		
		backPack.viewContents(); // View the existing contents of the backPack

	}

}
