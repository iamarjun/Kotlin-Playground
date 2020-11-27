class User(var firstName: String, var lastName: String, var isPlatinum: Boolean) {

    constructor(firstName: String, lastName: String): this(firstName, lastName, false) {
        println("2nd")
    }

    constructor(firstName: String): this(firstName, "Unknown") {
        println("3rd")
    }

}