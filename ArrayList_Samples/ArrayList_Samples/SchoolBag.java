
import java.util.ArrayList;
public class SchoolBag {
	
	private ArrayList<Book> pocket = new ArrayList<Book>(); // ArrayList pocket is created for storing books into the SchoolBag
	
	public void addBook(Book book) { // method for adding books
		pocket.add(book);
	}
	
	public void checkBook(Book book) { // method for checking a specific book. Displays the title of the book.
		System.out.println(book.getTitle());
	}
	
	public void viewContents() { // method for displaying the contents of the bag. A loop is used to make sure that all elements are displayed. 
		for(int i = 0; i < pocket.size(); i++){
			System.out.println("Title: " + pocket.get(i).getTitle());
			System.out.println("Author: " + pocket.get(i).getAuthor());
		}
	}
}
