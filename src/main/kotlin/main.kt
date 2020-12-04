fun main() {
    val a = User("arjun", 10)

    val (name, age) = a
    val b = a.copy()
    println(a == b)
    println(name)
    println(age)
}

data class User( val name: String,  val age: Int)