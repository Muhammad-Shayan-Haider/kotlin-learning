fun main() {

}

// In interfaces, all methods are by default abstract. A class can implement multiple interfaces.
// Interfaces can define common behaviours to implement. We can implement polymorphism using interfaces as well.
interface Draggable {

    val dragSpeed: Int
    fun drag()
}