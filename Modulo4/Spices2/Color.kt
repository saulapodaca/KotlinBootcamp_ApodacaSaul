package Modulo4.Spices2

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}

interface SpiceColor2 {
    val color: Color
}

object YellowSpiceColor2 : SpiceColor2 {
    override val color: Color = Color.YELLOW
}

interface Grinder2 {
    fun grind() {
        println("Grinding into a fine powder...")
    }
}

sealed class Spice2(
    val name: String,
    val spiciness: String = "mild",
    color: SpiceColor2 = YellowSpiceColor2
) : SpiceColor2 by color {

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

class Curry2(
    name: String,
    spiciness: String,
    color: SpiceColor2 = YellowSpiceColor2
) : Spice2(name, spiciness, color), Grinder2 {

    override fun prepareSpice() {
        println("Preparing $name:")
        grind()
    }
}

data class SpiceContainer2(val spice: Spice2) {
    val label: String = spice.name
}

fun main() {
    val curry = Curry2("Yellow Curry", "spicy")
    println("Color: ${curry.color} (RGB: 0x${curry.color.rgb.toString(16).uppercase()})")
}