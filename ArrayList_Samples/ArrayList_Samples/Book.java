
public class Book {
	
	private String sAuthor, sTitle;
	
	public Book(String sAuthor, String sTitle) { // Constructor so we add the author and title when the book is created
		this.sAuthor = sAuthor;
		this.sTitle = sTitle;
	}
	
	public String getAuthor() {
		return sAuthor;
	}
	
	public String getTitle() {
		return sTitle;
	}
}