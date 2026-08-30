package Modulo6.Game2

import kotlin.math.absoluteValue

enum class Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Location(val width: Int = 4, val height: Int = 4) {
    val map = Array(width) { arrayOfNulls<String>(height) }

    init {
        for (x in 0 until width) {
            for (y in 0 until height) {
                map[x][y] = "Coordinates ($x, $y): A mysterious zone in the forest."
            }
        }
        map[0][0] = "Coordinates (0, 0): Starting basecamp with a warm fire."
        map[3][3] = "Coordinates (3, 3): An abandoned tower overlooking the entire valley."
    }

    fun getDescription(x: Int, y: Int): String {
        return map[x][y] ?: "Unexplored void"
    }
}

class Game {
    var path = mutableListOf(Directions.START)
    val location = Location(4, 4)

    private var currentX = 0
    private var currentY = 0

    private fun updateLocation(dx: Int, dy: Int) {
        currentX = (currentX + dx).rem(location.width).let { (it + location.width).rem(location.width).absoluteValue }
        currentY = (currentY + dy).rem(location.height).let { (it + location.height).rem(location.height).absoluteValue }
        println(location.getDescription(currentX, currentY))
    }

    val north = {
        path.add(Directions.NORTH)
        updateLocation(0, 1)
        true
    }

    val south = {
        path.add(Directions.SOUTH)
        updateLocation(0, -1)
        true
    }

    val east = {
        path.add(Directions.EAST)
        updateLocation(1, 0)
        true
    }

    val west = {
        path.add(Directions.WEST)
        updateLocation(-1, 0)
        true
    }

    val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    fun move(where: () -> Boolean) {
        where()
    }

    fun makeMove(direction: String?) {
        when (direction?.lowercase()?.trim()) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

fun main() {
    val game = Game()
    println(game.location.getDescription(0, 0))

    while (true) {
        print("\nEnter a direction: n/s/e/w (any other key to exit): ")
        val input = readLine()
        game.makeMove(input)

        if (game.path.isEmpty()) {
            break
        }
    }
}