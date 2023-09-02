package it.discovery.kotlin.repository

import it.discovery.kotlin.model.*
import java.util.*

class XMLBookRepository(private val xmlFile: String) : BookRepository {
    private val books: MutableMap<Int, Book> = HashMap()

    private var counter = 0

    fun init() = println("Started XML repository with source file:$xmlFile")

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