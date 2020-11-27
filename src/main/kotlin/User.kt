class User(firstName: String, lastName: String) {

    private var age: Int = -1

    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName) {
        this.age = age
    }

    var fullName: String = "$firstName $lastName"
        private set

    init {
        println("1st init")
        println("FullName: $fullName")
    }

}