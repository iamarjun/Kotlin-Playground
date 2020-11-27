fun main() {
    book("Dragon Ball Z", "Akira Toriyama, Arjun Manoj")
    book("Dragon Ball Z", "Akira Toriyama, Arjun Manoj, Goku")
    book("Dragon Ball Z", "Akira Toriyama, Arjun Manoj, Goku, Vegita")
    book("Dragon Ball Z", "Akira Toriyama, Arjun Manoj, Goku, Vegita, Beerus")
}

fun book(name: String, vararg authors: String) {
    print("$name by ")
    authors.forEach { print(it) }
}