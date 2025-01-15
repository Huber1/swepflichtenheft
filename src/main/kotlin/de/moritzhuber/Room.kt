package de.moritzhuber

data class Room(
    val id: Int,
    val description: String,
    val betten: Int,
    val price: Float,
    val available: Boolean,
)
