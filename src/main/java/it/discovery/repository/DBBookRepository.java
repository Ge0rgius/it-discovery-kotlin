package it.discovery.repository;

import java.util.*;

import it.discovery.model.Book;

/**
 * Handles database-related book operations
 * 
 * @author morenets
 *
 */
public class DBBookRepository {
	private final Map<Integer, Book> books = new HashMap<>();

	private int counter = 0;

	private final String server = "localhost";

	private final String db = "library";
	
	public void init() {
		System.out.println("Started db repository with server:" + server + " and database: " + db );
	}

	public void destroy() {
		System.out.println("Shutting down repository ... ");
	}
	
	public void saveBook(Book book) {
		if (book.getId() == 0) {
			counter++;
			book.setId(counter);
		}
		
		books.put(book.getId(), book);

		System.out.println("Saved book " + book);
	}
	
	public Optional<Book> findBookById(int id) {
		return Optional.ofNullable(books.get(id));
	}

	public List<Book> findBooks() {
		return new ArrayList<>(books.values());
	}
	

}
