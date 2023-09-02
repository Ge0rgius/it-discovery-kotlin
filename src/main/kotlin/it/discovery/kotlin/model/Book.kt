package it.discovery.kotlin.model

import it.discovery.model.BookState
import it.discovery.model.Genre
import java.time.LocalDateTime
import java.util.*

data class Book(
    private var id: Int = 0, private
    val name: String? = null,
    private val year: Int = 0,
    private val pages: Int = 0,
    private val genre: Genre? = null,
    private val bookState: BookState? = null,
    private val created: LocalDateTime? = null,
    private val orderDate: LocalDateTime? = null,
    private val amount: Int = 0
) {
    fun getGenreName(): String {
        return Optional.of(genre!!).map { obj: Genre -> obj.name }
            .orElse("N/A")
    }

    fun getStatus(): String {
        return when (bookState) {
            null -> "Unknown"
            BookState.SOLD_OUT -> "Sold out"
            BookState.ORDERED -> "Ordered at $orderDate"
            else -> "Available amount: $amount"
        }
    }

}
