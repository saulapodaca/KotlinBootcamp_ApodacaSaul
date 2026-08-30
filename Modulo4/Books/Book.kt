package Modulo4.Books

open class Book(val title: String, val author: String) {
    private var currentPage: Int = 0

    open fun readPage() {
        currentPage++
    }
}

class eBook(
    title: String,
    author: String,
    val format: String = "text"
) : Book(title, author) {

    private var wordsRead: Int = 0

    override fun readPage() {
        wordsRead += 250
    }
}

fun main() {
    val physicalBook = Book("Clean Code", "Robert C. Martin")
    physicalBook.readPage()

    val digitalBook = eBook("Atomic Habits", "James Clear")
    println("Format: ${digitalBook.format}") // text
    digitalBook.readPage()
}