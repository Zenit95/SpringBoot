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
	
	public boolean insert(Author author) {
		logger.debug("simulando insercion");
		return true;
	}
	
	public boolean insert(Book book) {
		logger.debug("simulando insercion");
		return true;
	}

	public List searchAllAuthors(){
		return authorRespository.searchAll();
	}
	
	public List searchAllBooks(){
		return bookRepository.searchAll();
	}

}
