package Modulo4.Spices

class SimpleSpice{
    var name : String = "curry"
    var levelOfSpiciness : String = "mild"
    val heat : Int
        get(){return 5}

}

fun main (args: Array<String>){
    val spice = SimpleSpice()
    println("Name: ${spice.name} \n" +
            "Level of spice: ${spice.levelOfSpiciness} \n"+
            "Heat: ${spice.heat} ")
}