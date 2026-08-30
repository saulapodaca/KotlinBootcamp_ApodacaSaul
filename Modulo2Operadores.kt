import java.awt.Color

fun main (){
    peces()
    colores()
    coloresNull()
    listaNull()
    intNull()
}

fun peces(){
    val fish = 2.plus(71).plus(233).minus(13)
    println(fish)
    println(fish.div(30))
}

fun colores(){
    var rainbowColor : Color = Color(100, 0, 255)
    println(rainbowColor)
    rainbowColor = Color(0, 255, 100)
    println(rainbowColor)

    val blackColor : Color = Color(0, 0, 0)
    println(blackColor)
    //blackColor = Color(255, 255, 255)
}

fun coloresNull(){
    var rainbowColor : Color? = null
    println(rainbowColor)
    var greenColor : Color? = null
    println(greenColor)
    var blueColor: Color? = Color(0, 0, 255)
    blueColor = null
    println(blueColor)
}

fun listaNull(){
    var lista1 : List<Int?> = listOf(null, null)
    println(lista1)
    var lista2 : List<Int?>? = null
    lista2 = listOf(null, null)
    println(lista2)
    var lista3 : List<Int?>? = null
    println(lista3)
}

fun intNull(){
    var nullTest: Int? = null
    val result = nullTest?.plus(1) ?: 0
    println(result)
}