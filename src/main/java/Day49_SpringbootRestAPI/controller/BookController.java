package Day49_SpringbootRestAPI.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import Day49_SpringbootRestAPI.model.Book;
import Day49_SpringbootRestAPI.service.BookService;


@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "*")  
public class BookController {
	
	private final BookService service;
	
	public BookController(BookService service) {
		this.service = service;
	}
	
	@PostMapping
	public Book createBook(@RequestBody Book book) {
		return service.createNewBook(book);
	}
	
	@GetMapping
	public List<Book> getBook() {
		return service.getAllBook();
	}
	
	@GetMapping("/{id}")
	public Book getBook(@PathVariable Long id) {
		return service.getBookbyID(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteBook(@PathVariable Long id) {
		 service.removeBook(id);
		 return "Delete a Book " + id;
	}

}
