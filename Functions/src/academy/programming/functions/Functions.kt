package academy.programming.functions
// block body
fun main() {
    println(labelMultiply(3, 4, "The result is "))
    println(labelMultiply(3, 4, ))
    println(labelMultiply(label = "The changed order result is ", operand1 = 3, operand2 = 4))
    val emp = Employee("Jane")
    println(emp.toUpperCaseFirstName())

    val car1 = Car("green", "Toyota", 2020)
    val car2 = Car("red", "Toyota", 2020)
    val car3 = Car("blue", "Toyota", 2020)
    printColors(car1,car2,car3, str = "Color")
}
// the default return type is Unit.
// expression body
fun labelMultiply(operand1: Int, operand2: Int, label: String = "The label is ") =
    "$label ${operand1 * operand2}" // the return type is string and there is no need to assign it

fun printColors(vararg cars: Car,str: String){
    for (car in cars){
        println("$str ${car.colour}")
    }
}

class Employee(val firstName : String){
    fun toUpperCaseFirstName() = firstName.toUpperCase()
}

data class Car(val colour: String, val model: String, val year: Int){

}

