package academy.learnprogramming.accessmodifiers

val MY_CONSTANT = 100

fun main() {
    println(MY_CONSTANT)
    val emp = Employee("John")
    val emp2 = Employee("John")
    println(emp.name)
    println(emp.fullTime)
    emp.fullTime = false
    println(emp.fullTime)

    println(emp)

    val car = Car("blue", "Toyota", 2020)
    val car2 =  Car("blue", "Toyota", 2020)
    println(emp==emp2)
    println(car == car2)
    val car3 = car.copy()
    val car4 = car.copy(year = 2026, colour = "green")
    println(car3)
    println(car4)
    println(car)
}

class Employee(val name: String, fullTime: Boolean = true) {
    var fullTime = fullTime
        get() {
            println("this is a default get")
            return field
        }
        set(value) {
            println("this is a default set")
            field = value
        }

}

data class Car(val colour: String, val model: String, val year: Int) {


}