package it.discovery.kotlin.service

import it.discovery.model.Book
import it.discovery.repository.DBBookRepository
import java.util.*

class MainBookService {
    private val repository = DBBookRepository()

    init {
        println("Using db repository")
    }

    fun saveBook(book: Book) {
        repository.saveBook(book)
    }

    fun findBookById(id: Int): Optional<Book> {
        return repository.findBookById(id)
    }

    fun findBooks(): List<Book> {
        return repository.findBooks()
    }
}