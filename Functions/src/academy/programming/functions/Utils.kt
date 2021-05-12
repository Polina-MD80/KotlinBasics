package academy.programming.functions

import java.util.*

class Utils{

    fun upperFirstAndLast(str: String):String{
   val  firstToUpper = str.substring(0, 1).uppercase(Locale.getDefault()) + str.substring(1)
        return firstToUpper.substring(0, firstToUpper.length-1) + firstToUpper.substring(str.length-1)
            .uppercase(Locale.getDefault())
    }

}