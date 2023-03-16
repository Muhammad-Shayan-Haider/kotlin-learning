import kotlin.math.pow

fun main() {
    // Function stored in variable. Can be passed as argument as well.
    var fn: (a: Double, b: Double) -> Double = ::sum
    println(fn(2.0, 3.0))

    fn = ::power
    println(fn(2.0, 3.0))

    calculator(2.0, 4.0, fn)

    // Lambda functions are anonymous functions, which don't have names.
    val lambda1 = {x: Int, y: Int -> x + y}
    // last line in lambda is return line.
    val multilineLambda = { a: Int, b: String ->
        print("")
        print("")
        b
    }

    println(multilineLambda(2, "abc"))

    val singleParam: (Int) -> Int = { x -> x + x }
    val simplifiedLambdaWithSingleParam: (String) -> Int = { it.length } // it is default param for single param lambda.
    calculator(1.0, 2.0) {a, b -> a + b} // trailing lambda

    // map, filter and forEach
    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val oddsList = nums.filter { a: Int -> a % 2 != 0 } // we can pass function in here as well with same signature.
    // map maps data to another form
    val squares = nums.map {
        (it * it).toDouble()
    }
    println(oddsList)

    // forEach
    nums.forEach {
        println(it)
    }
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun power(a: Double, b: Double): Double {
    return a.pow(b)
}

// A higher order function is a function that accepts function as an argument or returns function or does both.
fun calculator(a: Double, b: Double, fn: (a: Double, b: Double) -> Double) {
    var result = fn(a, b)
    println(result)
}

