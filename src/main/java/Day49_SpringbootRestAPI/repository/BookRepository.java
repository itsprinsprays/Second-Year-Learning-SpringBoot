package Day49_SpringbootRestAPI.repository;

import java.util.*;

import org.springframework.stereotype.Repository;

import Day49_SpringbootRestAPI.model.Book;

@Repository
public class BookRepository {
	
	private List<Book> book = new ArrayList<Book>(Arrays.asList(
				new Book(1L, "SpringBoot in Action", "Craig Walls"),
				new Book(2L, "Java in Action", "James Gosling"),
				new Book(3L, "SpringBoot Mastery", "Prince Benitez")
			));
	
	public Book addBook(Book books) {
		book.add(books);
		return books;
	}
	
	public List<Book> readAll() {
		return book;
	}
	
	public Book readOne(Long ID) {
		return book.stream()
			.filter(s -> s.getID().equals(ID))
			.findFirst()
			.orElse(null);
	}
	
	public void deleteID(Long ID) {
		 book.removeIf(s -> s.getID().equals(ID));
	}
	
	

}
