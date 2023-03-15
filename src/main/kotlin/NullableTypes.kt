fun main() {
    // For nullable types, we use ? with data types for accepting null.
    var gender: String? = null

    if (gender != null) {
        gender.uppercase()
    }

    println(gender?.uppercase())

    // let scope is used to execute multiple statements if value is not null.
    gender?.let {
        println("gender is not null")
    }

    var genderNotNullableCopy = gender ?: "N/A" // if gender is null then default value is used. Elvis operator.
    val value = gender!!.uppercase() // if gender is null then exception will be thrown
}