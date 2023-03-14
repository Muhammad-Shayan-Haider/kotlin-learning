fun main() {
    val company1 = Company("Google")
    val company2 = Company("Google")

    println(company1 == company2) // Data classes compare objects on the basis of data. Other classes compare references.

    // We can copy data class objects.
    val company3 = company2.copy()
    println(company3)
    val (name) = company1 // destructuring
    println(name)

    // In data classes, all properties are components. We can access them by
    val companyName = company2.component1()
    println(companyName)
}

// Data class are used for the purpose of storing data.
data class Company(val name: String) {

}