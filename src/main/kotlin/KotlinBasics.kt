// Kotlin code is converted into byte code and is executed by JVM
fun main(args: Array<String>) { // main function is entry point of execution for JVM.
    println("Hello World")

    // val and var
    val a = 5 // val cannot be reassigned.
    var b = 6 // Type is already inferred to Int.
    b = 7 // var can be reassigned.

    // Data types
    var stringData: String = "abc"
    var intData: Int = 3
    var booleanData: Boolean = false
    var charData: Char = 'a'

    // Operators
    println(a + b)
    println(b / a)
    println(a > b)
    println(b++) // b = 7
    println(b) // b = 8
    println(++b) // b = 9
    println(b++ + ++b) // 9 + 11


    // Short circuit
    var i = 10
    var j = 11
    var result = (i == 10) || (j++ == 11) // i == 10 is true so by short circuit, second expression will not be evaluated, and j will remain 11.
    println(j)

    // Control flow/ Conditional
    if (a == b) {
        println("a == b")
    } else {
        println("a != b")
    }
    var resultant = if (a == b) { // if is an expression in Kotlin, its result can be assigned in variable.
        "a == b"
    } else {
        "a != b"
    }
    println(resultant)

    // Range
    val num = 10
    val isInRange = 1..10 // .. means inclusive
    println(isInRange)

    if (num in 1 until 10) { // in until upper end is exclusive
        println("in range")
    } else {
        println("not in range")
    }

    // When statement
    when (num) { // just like switch statement
        in 1..5 -> {
            println("number is b/w 1 to 5")
        }
        in 6..10 -> {
            println("number is b/w 6 to 10")
        }
        else -> { // else works like default case in switch.
            println("number is not in the range of 1 to 10")
        }
    }
    // When can also be used as an expression
    resultant = when (num) { // just like switch statement
        in 1..5 -> {
           "number is b/w 1 to 5"
        }
        in 6..10 -> {
            "number is b/w 6 to 10"
        }
        else -> { // else works like default case in switch.
            "number is not in the range of 1 to 10"
        }
    }
    println(resultant)

    // Loops
    var count = 5
    while (count >= 1) {
        count--
    }

    for (i in 10 downTo 1 step 1) {
        println(i)
    }

    // Function call
    println("sum = ${sum(a, b)}")
    // Named arguments
    sum(b = 10, a = 10)
    // We can store functions in variables
    var sumCallback: (a: Int, b: Int) -> Int = ::sum
    println(sum(14, 14))


    // Arrays
    var arr: Array<String> = arrayOf<String>("one", "two", "three")
    for (element in arr) {
        println(element)
    }
    arr[0] = "One" // we can also use .get and .set methods for getting and setting values respectively.
    for ((index, e) in arr.withIndex()) {
        println("$index ${arr[index]} $e")
    }
    println("size of arr: ${arr.size}")

    //

}

// Functions
fun sum(a: Int, b: Int): Int { // function parameters are val, and they cannot be reassigned.
    return a + b
}
// Inline function
fun add(a: Int, b: Int = 0) = a + b


