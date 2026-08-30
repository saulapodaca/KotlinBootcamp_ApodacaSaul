package Modulo3

fun main() {
    print("How do you feel today? ")
    val userMood = readLine()!!

    println(whatShouldIDoToday2(userMood))
}

fun whatShouldIDoToday2(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when {
        isStayInBed(mood, weather, temperature) -> "stay in bed"
        isGoSwimming(temperature) -> "go swimming"
        isGoForAWalk(mood, weather) -> "go for a walk"
        isWatchMovie(mood, weather) -> "stay home and watch a movie"
        isSkate(mood, weather, temperature) -> "go skating in the park"
        else -> "Stay home and read."
    }
}

fun isStayInBed(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun isGoSwimming(temperature: Int) =
    temperature > 35

fun isGoForAWalk(mood: String, weather: String) =
    mood == "happy" && weather == "sunny"

fun isWatchMovie(mood: String, weather: String) =
    mood == "tired" || weather == "rainy"

fun isSkate(mood: String, weather: String, temperature: Int) =
    mood == "energetic" && weather == "cloudy" && temperature in 15..25


