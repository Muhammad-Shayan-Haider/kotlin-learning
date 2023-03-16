fun main() {
    val colleage = Colleage()

    // with apply we can set property of the object.
    // apply returns the current object value.
    val obj = colleage.apply {
        name = "Shayan"
        age = 24
    }

    // let utility function allow us to access the properties of current object in the scope.
    // Its return value is its last statement. Let is also used when object is nullable, let will execute only if
    // object is not null.
    var returnValue = colleage.let {
        println(it.name)
        println(it.age)
    }

    // last line is the return value.
    var returnedObject = with(colleage) {
        name = "Shayan"
        age = 24
        this
    }

    // last line is the return value.
    var returnObj = colleage.run {
        name = "Shayan"
        age = 24
    }
}

data class Colleage(var name: String = "", var age: Int = 0)