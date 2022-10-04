
public class Book {
	String name;
	String author;
	int page;
	String isHardCover;

	public Book() {
		
	}

	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
	public Book(String name,String author,int page) {
		this(name,author);
		this.page = page;
	}
	
	
	public Book(int page, String isHardCover) {
		this.page = page;
		this.isHardCover = isHardCover;
	}
	
	
	
}