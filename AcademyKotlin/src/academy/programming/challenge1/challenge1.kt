package academy.programming.challenge1

fun main() {
    val hello1 = "hello"
    val hello2 = "hello"
    println("---")
    println("check if hello1 and hello2 are structurally equal: ${hello1 == hello2}")
    // they are also referentially equal!!! jvm looks in the string pool where string is kept
    println("check if hello1 and hello2 are referentially equal: ${hello1 === hello2}")
    println("---")
    var num = 2988
    val text: Any = "The Any type is the root of the Kotlin hierarchy."
    if (text is String){
        println(text.toUpperCase())
        println("---")
        println("""   1
                   |  11
                   | 111
                   |1111""".trimMargin())
        println("---")
        println("""1   1
                   1  11
                   1 111
                   11111""".trimMargin("1"))
    }
}