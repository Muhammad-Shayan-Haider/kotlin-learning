fun main() {
    var outerClassObj = Outer()
    var nested = Outer.Nested()
    nested.test()

    var innerClass = outerClassObj.InnerClass()
    innerClass.test()
}

class Outer {

    var i = 9
    // Nested class will always be instantiated with outer class. Nested class cannot access outer class variables.
    class Nested {
        fun test() {
            println("I am in nested class")
        }
    }

    // Inner class will always be instantiated with outer class object. Inner class can access outer class variables.
    inner class InnerClass {
        fun test() {
            println("I am in inner class $i")
        }
    }
}