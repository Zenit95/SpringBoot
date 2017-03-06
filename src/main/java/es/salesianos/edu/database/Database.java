package es.salesianos.edu.database;

import java.util.ArrayList;
import java.util.List;

import es.salesianos.edu.model.*;

public class Database {
	
	List<Author> listAuthor = new ArrayList<Author>();
	List<Book> listBook = new ArrayList<Book>();
	
	public List<Author> getListAuthor() {
		return listAuthor;
	}
	public void setListAuthor(List<Author> listAuthor) {
		this.listAuthor = listAuthor;
	}
	public List<Book> getListBook() {
		return listBook;
	}
	public void setListBook(List<Book> listBook) {
		this.listBook = listBook;
	}
	
	
	
	

}
