package it.discovery.kotlin.model

import java.time.LocalDateTime

data class Genre(
    private val name: String, private
    val created: LocalDateTime
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        return other is Genre && name == other.name
    }

    override fun hashCode()  = name.hashCode()
}
