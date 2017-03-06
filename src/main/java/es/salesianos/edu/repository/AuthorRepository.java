package es.salesianos.edu.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import es.salesianos.edu.database.Database;
import es.salesianos.edu.model.Author;

public class AuthorRepository {
	
	Database db = new Database();
	
	public void addAuthor(Author author){
		db.getListAuthor().add(author);
	}
	
	public List searchAllAuthor(){
		return db.getListAuthor();
	}

}
