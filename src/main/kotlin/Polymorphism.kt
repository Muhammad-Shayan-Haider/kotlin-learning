fun main() {
    val circle: Shape = Circle(2.0)
    val square: Square = Square(5.0)

    println(circle.area())
    println(square.area())
}

// Polymorphism: Child can be instantiated from parent's reference and all the methods that are
// present in parent can be overridden by child.
open class Shape {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(val radius: Double): Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val side: Double): Shape() {
    override fun area(): Double {
        return side * side
    }
}

fun calculateAreas(shapes: Array<Shape>) {
    for (shape in shapes) {
        println(shape.area())
    }
}