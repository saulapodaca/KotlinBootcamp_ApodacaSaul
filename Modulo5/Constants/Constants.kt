package Modulo5.Constants

const val MAX_BORROW_LIMIT = 5

object Constants {
    const val BASE_URL = "http://www.turtlecare.net/"
}

class Book(val title: String, val author: String, val year: Int) {

    companion object {
        const val BASE_URL = "http://www.turtlecare.net/"
    }

    fun canBorrow(currentBorrowedCount: Int): Boolean {
        return currentBorrowedCount < MAX_BORROW_LIMIT
    }

    fun printUrl() {
        val cleanTitle = title.lowercase().replace(" ", "_")
        val fullUrl = "$BASE_URL$cleanTitle.html"
        println(fullUrl)
    }
}

fun main() {
    val book = Book("1984", "George Orwell", 1949)

    println("Can borrow with 3 books? ${book.canBorrow(3)}") // true
    println("Can borrow with 5 books? ${book.canBorrow(5)}") // false

    book.printUrl()

    println("Book companion BASE_URL: ${Book.BASE_URL}")

    println("Global Constants BASE_URL: ${Constants.BASE_URL}")
}