package academy.learnprogramming.accessmodifiers

fun main() {
 val emp = Employee("John")
    println(emp.name)
    println(emp.fullTime)
    emp.fullTime = false
    println(emp.fullTime)

    println(emp)
}
private class Employee (val name: String,fullTime: Boolean = true){
    var fullTime = fullTime
    get(){
       println("this is a default get")
        return field
    }
    set(value) {
        println("this is a default set")
        field = value
    }

}