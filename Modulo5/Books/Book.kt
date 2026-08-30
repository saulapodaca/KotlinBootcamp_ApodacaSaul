package Modulo5.Books

class Book(val title: String, val author: String, val year: Int) {

    fun getTitleAndAuthor(): Pair<String, String> {
        return Pair(title, author)
    }

    fun getFullInfo(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main() {

    val myBook = Book("1984", "George Orwell", 1949)

    val bookInfo = myBook.getFullInfo()

    println("Here is your book ${bookInfo.first} written by ${bookInfo.second} in ${bookInfo.third}.")

    val (title, author, year) = myBook.getFullInfo()
    println("Here is your book $title written by $author in $year.")
}