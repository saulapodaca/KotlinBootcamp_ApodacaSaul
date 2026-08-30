package Modulo5.Books2

import java.util.Random

class Book(
    val title: String,
    val author: String,
    val year: Int,
    var pages: Int
)

fun Book.weight(): Double = pages * 1.5

fun Book.tornPages(torn: Int) {
    pages = if (pages >= torn) pages - torn else 0
}

class Puppy {
    private val random = Random()

    fun playWithBook(book: Book) {
        val pagesToTear = random.nextInt(20) + 1
        book.tornPages(pagesToTear)
        println("Puppy chewed off $pagesToTear pages! Remaining: ${book.pages} pages (Weight: ${book.weight()}g)")
    }
}

fun main() {
    val book = Book("Moby Dick", "Herman Melville", 1851, 100)
    val puppy = Puppy()

    println("Initial pages: ${book.pages}, Initial weight: ${book.weight()}g\n")

    while (book.pages > 0) {
        puppy.playWithBook(book)
    }

    println("\nThe puppy destroyed the book! Final weight: ${book.weight()}g")
}