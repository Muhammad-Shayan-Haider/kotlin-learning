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
}

// Classes
class Car(val name: String, val type: String) { // properties, this is primary constructor also

    fun driveCar() { // method
        println("Driving $name")
    }
}

class Person { // Class with initialized properties
    val name = ""
    var age = 20
}

class Animal(nameParam: String, soundParam: String, val isMammal: Boolean) { // Class with constructor parameters and properties.
    // Here nameParam and soundParam are only parameters (without val and var). And kingdom is property.
    // When we write val and var and primary constructor, then they become properties of classes.
    var name = nameParam.uppercase()
    var sound = soundParam.uppercase()
}

class House(area: Double = 2.0, var storey: Int) {
    // init blocks and property initializers are executed in the order they are defined.
    var areaOfHouse: Double = 1.0
    init {
        areaOfHouse = area
    }

    constructor(storey: Int): this(3.0, storey) { // secondary constructor: It always calls primary constructor.

    }
}