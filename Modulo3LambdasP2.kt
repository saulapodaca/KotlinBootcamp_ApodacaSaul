import java.util.Random

fun main() {
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    gamePlay(rollDice2)
    gamePlay(rollDice2)
    gamePlay(rollDice2)
}

fun gamePlay(operation: (Int) -> Int) {
    val roll = operation(6)
    println("Dice roll result: $roll")
}

