fun main() {
    val container = Container<Int>(9)
    container.setValue(2)
    println(container.getValue())

    val stringContainer = Container<String>("Hello")
    stringContainer.setValue("Hi")
    println(stringContainer.getValue())

    // vararg
    println(add(1, 2, 3, 4, 5, 6))
}

// Generic class
class Container<T>(var data: T) {
    fun setValue(value: T) {
        data = value
    }

    fun getValue(): T {
        return data
    }
}

// vararg: variable number of arguments
fun add(vararg values: Int): Int {
    var sum = 0
    for (i in values) {
        sum += i
    }
    values[values.size - 1] = sum
    return values[values.size - 1]
}