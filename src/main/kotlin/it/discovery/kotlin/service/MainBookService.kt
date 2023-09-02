package it.discovery.kotlin.service

import it.discovery.kotlin.model.Book
import it.discovery.kotlin.repository.BookRepository

class MainBookService(private val repository: BookRepository) {

    init {
        println("Using db repository")
    }

    fun saveBook(book: Book) = repository.saveBook(book)

    fun findBookById(id: Int) = repository.findBookById(id)

    fun findBooks() = repository.findBooks()
}