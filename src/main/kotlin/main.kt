fun main() {
    val a = User("arjun", 10)
    print(a.component1())

    val (name, age) = a
    print(name)
    print(age)
}

data class User( val name: String,  val age: Int)