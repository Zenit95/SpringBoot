package es.salesianos.edu.repository;

import java.util.ArrayList;
import java.util.List;

import es.salesianos.edu.model.Book;


public class BookRepository {

	public List searchAll() {

		List list = new ArrayList();
		Book book1 = new Book();
		book1.setTitle("Uno");
		book1.setIsbn("1111");
		book1.setAuthor("Bat");
		Book book2 = new Book();
		book2.setTitle("Dos");
		book2.setIsbn("2222");
		book2.setAuthor("Bi");
		Book book3 = new Book();
		book3.setTitle("Tres");
		book3.setIsbn("3333");
		book3.setAuthor("Iru");
		list.add(book1);
		list.add(book2);
		list.add(book3);
		

		return list;
	}

}
