package academy.learnprogramming.inheritance

fun main() {
    val laserPrinter = SpecialLaserPrinter("Bora 1234")
    println(laserPrinter.modelName)
    laserPrinter.printModel()
    println(laserPrinter.bestSellingPrice())
    println(laserPrinter.printModel())
}
abstract class Printer(val modelName: String) {
    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice() : Double
}

open class LaserPrinter(modelName: String) : Printer(modelName) {

    final override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice(): Double = 129.29
}
class SpecialLaserPrinter(modelName: String): LaserPrinter(modelName){

    override fun bestSellingPrice(): Double {
        return 123.34
    }

}
