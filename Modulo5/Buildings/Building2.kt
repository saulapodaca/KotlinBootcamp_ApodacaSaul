package Modulo5.Buildings

open class BaseBuildingMaterial2(val numberNeeded: Int = 1)
class Wood2 : BaseBuildingMaterial2(numberNeeded = 4)
class Brick2 : BaseBuildingMaterial2(numberNeeded = 8)

class Building3<out T : BaseBuildingMaterial2>(val material: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded
        get() = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${material::class.simpleName} required")
    }
}

fun <T : BaseBuildingMaterial2> isSmallBuilding(building: Building3<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("small building")
    } else {
        println("large building")
    }
}

fun main() {
    val woodBuilding = Building3(Wood2())
    val brickBuilding = Building3(Brick2())

    isSmallBuilding(woodBuilding)

    isSmallBuilding(brickBuilding)
}