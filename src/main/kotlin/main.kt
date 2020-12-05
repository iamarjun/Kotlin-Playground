fun main() {
}

open class Person(var name: String, var age: Int) {

    fun info() {
        println("This person's name is $name and the age is $age")
    }
}

open class Chef(name: String, age: Int, var favouriteFood: String) : Person(name, age) {

    protected fun printFavouriteFood() = println(favouriteFood)

    fun setMyFavouriteFood(food: String) {
        favouriteFood = food
        printFavouriteFood()
    }
}

open class SousChef(name: String, age: Int, favouriteFood: String): Chef(name, age, favouriteFood) {

    init {
        printFavouriteFood()
    }
}