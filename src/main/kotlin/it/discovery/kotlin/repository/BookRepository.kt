package it.discovery.kotlin.repository

import it.discovery.kotlin.model.*
import java.util.*

sealed interface BookRepository {
    fun saveBook(book: Book)
    fun findBookById(id: Int): Optional<Book>
    fun findBooks(): List<Book>
}