fun main() {
    val a = User("arjun", 10)
    val b = a.copy()
    println(a == b)

    val c = Pair("Arjun", 10)
    val d = Triple("Arjun", false, 25)

    val (title, years) = c
    val (name, isSingle, age) = d
}

data class User( val name: String,  val age: Int)