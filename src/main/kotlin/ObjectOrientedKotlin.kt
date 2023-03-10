fun main(args: Array<String>) {
    val mustang = Car("mustang", "petrol")
    println(mustang.name)
    mustang.driveCar()

    var person = Person()
    println(person.age)

    var cow = Animal("Cow", "Moo", true)
    println(cow.isMammal)

    var house = House(storey = 2)
    println(house.areaOfHouse) // 3.0

    var calculator = Calculator()
    calculator.add(2, 3)

    var child = Child(20)
}

// Classes
class Car(val name: String, val type: String) { // properties, this is primary constructor also

    fun driveCar() { // method
        println("Driving $name")
    }
}

// Class with initialized properties
class Person {
    val name = ""
    var age = 20
}

// Class with constructor parameters and properties.
class Animal(nameParam: String, soundParam: String, val isMammal: Boolean) {
    // Here nameParam and soundParam are only parameters (without val and var). And kingdom is property.
    // When we write val and var and primary constructor, then they become properties of classes.
    var name = nameParam.uppercase()
    var sound = soundParam.uppercase()
}

// init blocks and property initializers.
class House(area: Double = 2.0, var storey: Int) {
    // init blocks and property initializers are executed in the order they are defined.
    var areaOfHouse: Double = 1.0
    init {
        areaOfHouse = area
    }

    constructor(storey: Int): this(3.0, storey) { // secondary constructor: It always calls primary constructor.

    }
}

// Default constructor, and lateinit.
class Calculator {
    // This class will get a default constructor.

    lateinit var message: String // lateinit means that we don't know its value when initializing, it will be initialized late. It will always be var.
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}

// Getters and setters.
class Employee(name: String, age: Int) {
    var name: String = name
        get() { // getter returns the field value, and field is representing the variable.
            return field.uppercase()
        }
    var age: Int = age
        set(value) { // setter: value is the value of the field, and field is representing the variable.
            if (value > 0) {
                field = value
            } else {
                field = -1 * value
            }
        }
}

// Inheritance.
open class Parent(val age: Int) { // open means class can be inherited.
    open val name: String = "Parent"

    init {
        println("parent's init")
    }
    open fun doSomething() {
        println("in parent")
    }
}

// Overriding properties and methods.
class Child(age: Int): Parent(age) { // Class B inheriting A. First parent constructor is called and then child's constructor is called.
    // If parent class has primary constructor, inheriting child class needs to implement parent's constructor.
    override val name: String = "Child"
    init {
        println("child's init")
    }

    override fun doSomething() {
        super.doSomething() // calling parent's implementation.

        println("in child")
    }
}