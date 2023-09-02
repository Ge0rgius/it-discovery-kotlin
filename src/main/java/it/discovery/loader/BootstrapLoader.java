package it.discovery.loader;

import java.time.LocalDateTime;
import java.util.List;

import it.discovery.model.Book;
import it.discovery.model.BookFactory;
import it.discovery.model.BookState;
import it.discovery.model.Genre;
import it.discovery.service.MainBookService;

public class BootstrapLoader {

	public static void main(String[] args) {
		MainBookService service = new MainBookService();
		Book book = BookFactory.createBook(BookState.PRESENT);
		book.setName("Introduction into Kotlin");
		book.setPages(100);
		book.setYear(2021);

		Genre genre = new Genre("IT", LocalDateTime.now());
		book.setGenre(genre);

		service.saveBook(book);

		List<Book> books = service.findBooks();
		System.out.println(books);

		Book book1 = service.findBookById(book.getId()).orElseThrow();
		System.out.println(book1);
	}

}
