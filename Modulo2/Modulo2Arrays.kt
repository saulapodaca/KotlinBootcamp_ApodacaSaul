package Modulo2

import kotlin.math.pow

fun main(){
    arrayQuiz()
    looping()
    challenge()
}

fun arrayQuiz(){
    val array = Array(7){1000.0.pow(it)}// initalize array here
    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
        "terabyte", "petabyte", "exabyte")
    for ((i, value) in array.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }
}

fun looping(){
    val numbers = intArrayOf(11,12,13,14,15)
    val stringList = mutableListOf<String>()
    for (number in numbers) {
        stringList.add(number.toString())
    }
    println(stringList)
}

fun challenge(){
    val divisibleBySeven = mutableListOf<Int>()
    for(i in 0..100 step 7){
        divisibleBySeven.add(i)
    }
    println(divisibleBySeven)
}