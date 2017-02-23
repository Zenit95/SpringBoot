package es.salesianos.edu.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import es.salesianos.edu.model.Author;
import es.salesianos.edu.model.Book;
import es.salesianos.edu.repository.*;

@Service
public class SimulacroService {
	
	private static final Logger logger = LogManager.getLogger(SimulacroService.class.getName());

	private AuthorRepository authorRespository = new AuthorRepository();
	private BookRepository bookRepository = new BookRepository();
	
	public boolean addAuthor(Author author) {
		authorRespository.addAuthor(author);
		return true;
	}
	
	public List searchAllAuthor(){
		return authorRespository.searchAllAuthor();
	}
	
	public boolean addBook(Book book) {
		bookRepository.addBook(book);
		return true;
	}
	
	public List searchAllBook(){
		return bookRepository.searchAllBook();
	}

}
