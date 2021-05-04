package academy.programming.challenge2

fun main() {
    val float1 = -3847.384f
    var float2: Float? = -3847.384f
    val float3 = (-3847.384).toFloat()

    val myArray: Array<Short> = arrayOf(1, 2, 3, 4, 5)
    val myArray2 = shortArrayOf(1, 2, 3, 4, 5)
    val myArray3 = Array<Int?>(40) { i -> (i + 1) * 5 }
    for (int in myArray3) {
        print(int)
    }

}