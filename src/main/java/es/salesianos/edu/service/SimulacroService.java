package es.salesianos.edu.service;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Date;
=======
>>>>>>> e3571aa96a941bf077c07f4cc4863ef0a2697634
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import es.salesianos.edu.model.Author;
<<<<<<< HEAD

@Service
public class SimulacroService {

	private static final Logger logger = LogManager.getLogger(SimulacroService.class.getName());

	public boolean insert(Author author) {
		logger.debug("simulando insercion");
		return true;
	}

	public List searchAll(Author author) {
		List list = new ArrayList();
		if (author.getNameAuthor() != null) {
			Author author1 = new Author();
			author1.setNameAuthor("Bat");
			author1.setDateOfBirth(new Date());
			Author author2 = new Author();
			author2.setNameAuthor("Bi");
			author2.setDateOfBirth(new Date());
			Author author3 = new Author();
			author3.setNameAuthor("Iru");
			author3.setDateOfBirth(new Date());
			list.add(author1);
			list.add(author2);
			list.add(author3);
		}

		return list;
=======
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
>>>>>>> e3571aa96a941bf077c07f4cc4863ef0a2697634
	}

}
