package it.discovery.kotlin.loader

import it.discovery.kotlin.repository.XMLBookRepository
import it.discovery.model.BookFactory
import it.discovery.model.BookState
import it.discovery.model.Genre
import it.discovery.kotlin.service.MainBookService
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val service = MainBookService(XMLBookRepository("books.xml"))
    val book = BookFactory.createBook(BookState.PRESENT)
    book.setName("Introduction into Kotlin")
    book.setPages(100)
    book.setYear(2021)

    val genre = Genre("IT", LocalDateTime.now())
    book.setGenre(genre)

    service.saveBook(book)

    val books = service.findBooks()
    println(books)

    val book1 = service.findBookById(book.getId()).orElseThrow()
    println(book1)
}