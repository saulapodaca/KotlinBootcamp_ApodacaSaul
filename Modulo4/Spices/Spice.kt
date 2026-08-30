package Modulo4.Spices

class Spice(val name: String, val levelOfSpiciness: String = "mild") {

    val heat: Int
        get() = when (levelOfSpiciness) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 12
            else -> 0
        }
    init {
        println("Spice created: $name (Spiciness: $levelOfSpiciness, Heat: $heat)")
    }
}

fun makeSalt() = Spice("salt")

fun main() {
    val spices = listOf(
        Spice("curry", "medium"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "very spicy"),
        Spice("green curry", "spicy"),
        makeSalt()
    )

    println("\nModulo4.Spices that are spicy or less than spicy:")
    val spicyOrLess = spices.filter { it.heat <= 10 }

    for (spice in spicyOrLess) {
        println("${spice.name} - Heat: ${spice.heat}")
    }
}