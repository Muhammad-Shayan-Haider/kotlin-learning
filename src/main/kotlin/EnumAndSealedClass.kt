fun main() {
    val day = Day.Monday
    val anotherDay = Day.Monday
    println(day)

    for (i in Day.values()) {
        println(i)
    }
    day.printFormattedDay()

    val tile1 = Red("mushroom", 10)
    val tile2 = Blue(20)

    println(tile1.type)

    val tile: Tile = Red("Mushroom", 25)

    val points = when(tile) {
        is Red -> tile.points * 2
        is Blue -> tile.points * 3
    }
}

// Enum stores a set of values.
enum class Day(val number: Int) { // values are the instances of enum.
    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thursday(5),
    Friday(6),
    Saturday(7); // Semicolon is separator between values and methods.

    fun printFormattedDay() {
        println("Day is $this") // this refers to current object.
    }

}

// In sealed classes, we use types of instances. We can change the state of instances.
sealed class Tile {

}
class Red(val type: String, val points: Int): Tile() {

}

class Blue(val points: Int): Tile() {

}