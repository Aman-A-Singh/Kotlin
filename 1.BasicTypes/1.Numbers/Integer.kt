fun definingIntegers() {
    /* */
    var ivar = 1 // Int
    println("Type of ivar is ${ivar::class.simpleName}   :${ivar}")

    /*If the integer we assign is too large to fit into an Int, it will use a Long instead. */
    var lvar1 = 3000000000 // Long
    println("Type of lvar1 is ${lvar1::class.simpleName} :${lvar1}")

    /*we can also create a Long object and variable if we add an “L” to the end of the integer  */
    var lvar2 = 1L // Long
    println("Type of lvar2 is ${lvar2::class.simpleName} :${lvar2}")

    var bvar: Byte = 1
    println("Type of one is ${bvar::class.simpleName}   :${bvar}")

    /*Assigning binary number */
    var binvar = 0b10
    println("Type of binvar is ${binvar::class.simpleName} :${binvar}")

    /*Assigning hexadecimal number */
    var octvar = 0xAB
    println("Type of octvar is ${octvar::class.simpleName} :${octvar}")

    /*Error :compiler really cares about a variable’s type so that it can stop you from performing inappropriate operations that may lead to bugs in your code */
    // var x: Int = 3.12

    /*To make long numeric constants more readable, Kotlin allows you to place underscores in the numbers, where it makes sense to you. Try entering different numeric constants. */
    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
    println("More Readable :")
    println(oneMillion)
    println(socialSecurityNumber)
    println(hexBytes)
    println(bytes)
}

fun conversion() {
    val ivar: Int = 6

    /*error: type mismatch: inferred type is Int but Byte was expected */
    // val bvar: Byte = ivar
    val bvar1: Byte = ivar.toByte()
    println("bvar1 : ${bvar1} (${bvar1::class.simpleName})")

    val bvar2: Byte = 6 // Ok
    println("bvar2 : ${bvar2} (${bvar2::class.simpleName})")

    val ivar2 = ivar // ok
    println("ivar2 : ${ivar2} (${ivar2::class.simpleName})")
}

fun main() {
    definingIntegers()
    conversion()
}
