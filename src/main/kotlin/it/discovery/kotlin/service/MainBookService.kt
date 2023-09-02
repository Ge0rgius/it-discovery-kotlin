package it.discovery.kotlin.service

import it.discovery.model.Book
import it.discovery.repository.DBBookRepository

class MainBookService {
    private val repository = DBBookRepository()

    init {
        println("Using db repository")
    }

    fun saveBook(book: Book) = repository.saveBook(book)

    fun findBookById(id: Int) = repository.findBookById(id)

    fun findBooks() = repository.findBooks()
}