package Day49_SpringbootRestAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Day49_SpringbootRestAPI.model.Book;
import Day49_SpringbootRestAPI.repository.BookRepository;

@Service
public class BookService {
	
	private BookRepository repo;
	
	public BookService(BookRepository repo) {
		this.repo = repo;
	}
	
	public Book createNewBook(Book book) {
		return repo.addBook(book);
	}
	
	public List<Book> getAllBook() {
		return repo.readAll();
	}
	
	public Book getBookbyID(Long ID) {
		return repo.readOne(ID);
	}
	
	public void removeBook(Long ID) {
		repo.deleteID(ID);
	}

}
