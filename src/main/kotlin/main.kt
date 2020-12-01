fun main() {
    println(Membership.BRONZE.discount())
    print(Membership.membershipByName("platinum"))
}

enum class Membership {
    BRONZE {
        override fun discount() = 5
    },
    SILVER {
        override fun discount() = 10
    },
    GOLD {
        override fun discount() = 15
    },
    PLATINUM {
        override fun discount() = 20
    };

    abstract fun discount(): Int

    companion object {

        fun membershipByName(name: String) = valueOf(name.toUpperCase())
    }

}