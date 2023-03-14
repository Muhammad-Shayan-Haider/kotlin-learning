fun main() {
    MyClass.MyObject.foo()
    MyClass.bar()
}

class MyClass {
    object MyObject { // Kind of static object. It will have only once instance.
        fun foo() {
            println("I am foo")
        }
    }

    // Only one companion is allowed per class. We can use companion object as static, as there is no static in Kotlin.
    // Companion is used in factory pattern also for creating objects. 
    companion object AnotherObject { // Making object declaration companion can make the properties and fun in object declaration directly accessible from class.

        @JvmStatic // It is used to make the function static same as in Java.
        fun bar() {
            println("I am bar")
        }
    }
}