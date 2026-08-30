fun main (args: Array<String>) {
    val birthday = getBirthday()
    println(getFortuneCookie2(birthday))
}

fun getFortuneCookie(): String{
    val fortunes :List<String> = listOf("You will have a great day!",
    "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    val index = birthday % fortunes.size

    return fortunes[index]
}

fun getFortuneCookie2(birthday: Int): String{
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    return when (birthday) {
        28, 31 -> "Enjoy a wonderful day of success."
        in 1..7 -> "You will have a great day!"
        else -> fortunes[birthday % fortunes.size]
    }

}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}