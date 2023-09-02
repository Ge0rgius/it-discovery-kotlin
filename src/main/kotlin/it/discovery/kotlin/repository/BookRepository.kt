package it.discovery.kotlin.repository

import it.discovery.model.Book
import java.util.*

sealed interface BookRepository {
    fun saveBook(book: Book)
    fun findBookById(id: Int): Optional<Book>
    fun findBooks(): List<Book>
}