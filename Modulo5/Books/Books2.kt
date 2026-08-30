package Modulo5.Books

fun main() {
    val allBooks = setOf("Hamlet", "Macbeth", "Romeo and Juliet", "Othello")

    val library = mapOf("William Shakespeare" to allBooks)

    val hasHamlet = library.any { it.value.contains("Hamlet") }
    println("Does the library contain 'Hamlet'? $hasHamlet")

    val moreBooks = mutableMapOf("The Hobbit" to "J.R.R. Tolkien")

    val author1 = moreBooks.getOrPut("The Hobbit") { "Unknown Author" }
    println("Author of 'The Hobbit': $author1")

    val author2 = moreBooks.getOrPut("1984") { "George Orwell" }
    println("Author of '1984': $author2")

    println("Updated moreBooks map: $moreBooks")
}