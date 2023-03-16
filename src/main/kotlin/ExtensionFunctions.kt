fun main() {
    println("Hello".formattedString())
}

// Class need to be open if we want to inherit it for extending its functionality. If it's not open,
// then we can extend its functionality using extension functions.
// If we are defining an extension function, then we can define it by writing class name, then dot, and then function name.
// Cannot access private variables of class in extension functions.
fun String.formattedString(): String {
    return "----$this-----"
}

// When we define lambda functions, they are converted to class functions behind the scenes.
// When we define inline function, it as it is copies the code in the function to its calls behind the scene.
// We define inline especially when function is higher order function.
inline fun performOperation(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}