fun main() {
    // Type checking
    val circle = Circle(4.0)

    if (circle is Circle) {
        println("This is circle")
    }

    val arr = arrayOf(circle, Square(6.0))
    for (obj in arr) {
        if (obj is Circle) {
            println(obj.radius) // smart casting, Kotlin automatically casts the obj to circle.
        } else {
            println((obj as Square).side) // casting 
        }
    }
}