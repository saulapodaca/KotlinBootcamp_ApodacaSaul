package Modulo3

fun main (args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    println(spices.toString())
    val curries = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println(curries.toString())
    val ceFilter1 = spices.filter { it.startsWith('c') && it.endsWith('e') }
    println(ceFilter1.toString())
    val ceFilter2 = spices.filter { it.first() == 'c' && it.last() == 'e' }
    println(ceFilter2.toString())
    val firstThreeC = spices.take(3).filter { it.startsWith('c') }
    println(firstThreeC.toString())
}