package es.salesianos.edu.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import es.salesianos.edu.model.Author;

public class AuthorRepository {

	public List searchAll() {

		List list = new ArrayList();
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

		return list;
	}

}
