fun main(args: Array<String>) {
    println("Hello World!")

    fun hello() {
        println("Hello")

        fun moo() {
            println("Moo")
        }

        moo()
    }

    hello()
}