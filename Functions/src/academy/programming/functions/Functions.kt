package academy.programming.functions

import java.util.*

// block body
fun main() {
    println(labelMultiply(3, 4, "The result is "))
    println(labelMultiply(3, 4))
    println(labelMultiply(label = "The changed order result is ", operand1 = 3, operand2 = 4))
    val emp = Employee("Jane")
    println(emp.toUpperCaseFirstName())

    val car1 = Car("green", "Toyota", 2020)
    val car2 = Car("red", "Toyota", 2020)
    val car3 = Car("blue", "Toyota", 2020)
    printColors(car1, car2, car3)

    val arrayOfCars = arrayOf(car1, car2, car3)
    val arrayOfLessCars = arrayOf(car1, car2)
    val manyCars = arrayOf(*arrayOfCars, *arrayOfLessCars, car3)
    printColors(*manyCars)

    fun foo(vararg numbers: Int) {
        numbers.forEach(::println)
    }

    val list = listOf(1, 2, 3)

    foo(*list.toIntArray())

    println(whatever())

    println(Utils().upperFirstAndLast("this is it"))
    val s = "alabala"
    println(s.upperFirstAndLastAsIllusion())

}
// this is the way to associate the function with the String class (extension)
fun String.upperFirstAndLastAsIllusion(): String {
    val firstToUpper = this.substring(0, 1).uppercase(Locale.getDefault()) + this.substring(1)
    return firstToUpper.substring(0, firstToUpper.length - 1) + firstToUpper.substring(this.length - 1)
        .uppercase(Locale.getDefault())
}

// the default return type is Unit.
// expression body
inline fun labelMultiply(operand1: Int, operand2: Int, label: String = "The label is ") =
    "$label ${operand1 * operand2}" // the return type is string and there is no need to assign it

fun printColors(vararg cars: Car) {
    for (car in cars) {
        println(car.colour)
    }

}

class Employee(val firstName: String) {
    fun toUpperCaseFirstName() = firstName.toUpperCase()
}

data class Car(val colour: String, val model: String, val year: Int) {

}

fun whatever() = 3 * 4

