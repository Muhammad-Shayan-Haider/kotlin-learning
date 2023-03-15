import java.lang.IllegalArgumentException

fun main() {
    val arr = arrayOf(1, 2, 3)
    try {
        // Error can happen so we use that in try
        println(arr[5])
    } catch (e: Exception) {
        // Catch block is triggered in case of exception. Multiple catch blocks can be defined.
        println(e.message)
    }
    finally {
        // Finally will always execute regardless of exception.
        println("Finally block")
    }
    // try cannot be used alone, there must be catch of finally block.
    createUserList(-2)
}

fun createUserList(count: Int) {
    if (count < 0) {
        throw IllegalArgumentException("count must be greater than 0")
    } else {
        println("create user list")
    }
}