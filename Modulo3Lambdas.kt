import java.util.Random

fun main(args: Array<String>) {
    val rollDice = { sides: Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    println("rollDice (6 lados): ${rollDice(6)}")
    println("rollDice (12 lados): ${rollDice(12)}")
    println("rollDice (0 lados): ${rollDice(0)}")

    println("rollDice2 (20 lados): ${rollDice2(20)}")
    println("rollDice2 (0 lados): ${rollDice2(0)}")
}

