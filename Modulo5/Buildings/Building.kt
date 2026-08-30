package Modulo5.Buildings

open class BaseBuildingMaterial(val numberNeeded: Int = 1)

class Wood : BaseBuildingMaterial(numberNeeded = 4)
class Brick : BaseBuildingMaterial(numberNeeded = 8)

class Building<T : BaseBuildingMaterial>(val material: T) {

    val baseMaterialsNeeded = 100

    val actualMaterialsNeeded
        get() = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${material::class.simpleName} required")
    }
}

class Building2<out T : BaseBuildingMaterial>(val material: T) {
    val baseMaterialsNeeded = 100

    val actualMaterialsNeeded
        get() = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${material::class.simpleName} required")
    }
}

fun main() {
    val woodBuilding = Building(Wood())
    woodBuilding.build() // Imprime: 400 Wood required

    val brickBuilding = Building(Brick())
    brickBuilding.build() // Imprime: 800 Brick required
}