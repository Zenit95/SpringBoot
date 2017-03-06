package es.salesianos.edu.repository;

import java.util.ArrayList;
import java.util.List;

import es.salesianos.edu.database.Database;
import es.salesianos.edu.model.Author;
import es.salesianos.edu.model.Book;


public class BookRepository {

	Database db = new Database();
	
	public void addBook(Book book){
		db.getListBook().add(book);
	}
	
	public List searchAllBook(){
		return db.getListBook();
	}

}
