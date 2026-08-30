package Modulo2

fun main(){
    fishString()
    whenStatements()
}

fun fishString(){
    var trout :String? = "trout"
    var haddock : String? = "haddock"
    var snapper : String? = "snapper"

    println("I like to eat $snapper, but I don't like to eat $trout or $haddock.")
}

fun whenStatements(){
    val fishName :String = "trout"
    when(fishName.length){
        0 -> println("Error: fish name cannot be empty")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }
}