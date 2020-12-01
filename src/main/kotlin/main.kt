fun main() {


    /**
     * Nested inner classes hold a reference to the container class
     * hence can only be accessed via an object of the container class
     */
    val myCar = Vehicle()
    myCar.info()

    val steeringWheel = myCar.SteeringWheel()
    steeringWheel.info()

    val transmission = myCar.Transmission()
    transmission.info()

}

class Vehicle {

    var brand: String = "unknown"
    fun info() = println(brand)

    inner class SteeringWheel {
        var name: String = "Leather"
        fun info() = println("$brand has $name steering wheels")
    }

    inner class Transmission {
        var type = "Automatic"
        fun info() = println("The vehicle has shifted")
    }
}

