package Day49_SpringbootRestAPI.model;

public class Book {
	
	private Long ID;
	private String title;
	private String author;
	
	public Book(Long ID, String title, String author) {
		this.ID = ID;
		this.title = title;
		this.author = author;
	}
	
	public Long getID() {return ID;}
	public String getTitle() {return title;}
	public String getAuthor() {return author;}

}
