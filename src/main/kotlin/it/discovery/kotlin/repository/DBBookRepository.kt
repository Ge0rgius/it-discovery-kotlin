package it.discovery.kotlin.repository

import it.discovery.model.Book
import java.util.*

class DBBookRepository : BookRepository {
    private val books: MutableMap<Int, Book> = HashMap()

    private var counter = 0

    private val server = "localhost"

    private val db = "library"

    fun init() {
        println("Started db repository with server:$server and database: $db")
    }

    fun destroy() {
        println("Shutting down repository ... ")
    }

    override fun saveBook(book: Book) {
        if (book.id == 0) {
            counter++
            book.id = counter
        }
        books[book.id] = book
        println("Saved book $book")
    }

    override fun findBookById(id: Int): Optional<Book> {
        return Optional.ofNullable(books[id])
    }

    override fun findBooks(): List<Book> {
        return ArrayList(books.values)
    }

}