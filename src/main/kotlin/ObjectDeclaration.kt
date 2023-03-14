fun main() {
    println(ObjectDeclarationA.num)
    println(Singleton.getProperty())

    // Object expression: Anonymous object, they can implement classes and interfaces also.
    val testObject = object: Shape(), Cloneable {
        val property = 10

        fun method() {
            println("I am object expression")
        }

        override fun area(): Double {
            return 1.0
        }
    }
    testObject.method()
}

// Object declarations: We can directly use then as objects.
// Class and its single object is created at once.
// No constructors are allowed. Only init blocks are allowed.
// You can inherit class/interface.
// Singleton pattern.
object ObjectDeclarationA {
    val num: Int = 10
}

object ObjectDeclarationB {
    val p: Int = 20

    fun test() {
        println("I am object B")
    }
}

// Singleton
object Singleton {
    private var property: String = "Singleton"

    fun getProperty() = property
}

