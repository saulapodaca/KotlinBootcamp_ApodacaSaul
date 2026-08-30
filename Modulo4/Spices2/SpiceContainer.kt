package Modulo4.Spices2

data class SpiceContainer(val spice: Spice) {
    val label: String = spice.name
}

fun main() {
    val yellowCurry = Curry("Yellow Curry", "mild")
    val redCurry = Curry("Red Curry", "spicy")
    val greenCurry = Curry("Green Curry", "medium")

    val container1 = SpiceContainer(yellowCurry)
    val container2 = SpiceContainer(redCurry)
    val container3 = SpiceContainer(greenCurry)

    val containers = listOf(container1, container2, container3)

    for (container in containers) {
        println(container.label)
    }
}