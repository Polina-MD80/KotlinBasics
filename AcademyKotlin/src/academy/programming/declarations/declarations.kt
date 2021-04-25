package academy.programming.declarations

fun main() {
    val employeeOne = Employee("Jon", 1)
    val employeeTwo = Employee("Smith", 2)
    val employeeThree = Employee("Smith", 2)


    println(employeeOne == employeeTwo)
    println(employeeThree == employeeTwo)
    println(employeeThree === employeeThree)
    println(employeeThree === employeeTwo)

    val s1 = Shape("circle")
    val s2 = Shape("circle")
    println(s1 == s2) //false
    println(s1 === s2) //false
}

class Employee(var name: String, val id: Int)
class Shape(val name: String)
