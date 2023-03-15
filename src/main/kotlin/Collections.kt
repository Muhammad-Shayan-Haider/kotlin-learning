fun main() {
    // dynamic sized array
    var arr = mutableListOf<Int>(1, 2, 3)
    arr.add(4)
    println(arr)

    // In array, we cannot append new values, but we can update them. In case of immutableList, we cannot even update the value.
    var list = listOf<Int>(1, 2, 3)
    println(list[0])
    println(list.indexOf(1))
    println(list.contains(4))

    // map is a collection of key value pairs.
    val students = mutableMapOf<Int, String>()
    students.put(1, "Ryan")
    students.put(2, "John")
    students.put(2, "Katie")

    println(students)
    for ((key, value) in students) {
        println("$key, $value")
    }
    students[9] = "Jones"

    // immutable map
    val map = mapOf(1 to "A", 2 to "B")
    println(map)
}