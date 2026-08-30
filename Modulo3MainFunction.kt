import java.util.Calendar

fun main(args: Array<String>) {
    println("Hello, world!")
    dayOfWeek()
}

fun dayOfWeek(){
    println("What day is it today?")
    val dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(dayOfWeek)
    when (dayOfWeek) {
        Calendar.SUNDAY -> println("Sunday is the first day of the week")
        Calendar.MONDAY -> println("Monday is the second day of the week")
        Calendar.TUESDAY -> println("Tuesday is the third day of the week")
        Calendar.WEDNESDAY -> println("Wednesday is the fourth day of the week")
        Calendar.THURSDAY -> println("Thursday is the fifth day of the week")
        Calendar.FRIDAY -> println("Friday is the sixth day of the week")
        Calendar.SATURDAY -> println("Saturday is the last day of the week")
    }
}