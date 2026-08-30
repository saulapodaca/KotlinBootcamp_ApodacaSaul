package Modulo4.Spices2

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color: String = "yellow"
}

interface Grinder {
    fun grind() {
        println("Grinding into a fine powder...")
    }
}

abstract class Spice(
    val name: String,
    val spiciness: String = "mild",
    color: SpiceColor = YellowSpiceColor
) : SpiceColor by color {

    val heat: Int
        get() = when (spiciness.lowercase()) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 12
            else -> 0
        }

    abstract fun prepareSpice()
}

class Curry(
    name: String,
    spiciness: String,
    color: SpiceColor = YellowSpiceColor
) : Spice(name, spiciness, color), Grinder {

    override fun prepareSpice() {
        println("Preparing $name:")
        grind()
    }
}

fun main() {
    val indianCurry = Curry("Indian Yellow Curry", "spicy")

    println("Spice: ${indianCurry.name}")
    println("Spiciness: ${indianCurry.spiciness} (Heat: ${indianCurry.heat})")
    println("Color: ${indianCurry.color}") // Acceso a la propiedad delegada de SpiceColor

    indianCurry.prepareSpice()
}