fun main() {


    /**
     * Nested class don't hold a reference to the parent class
     */
    val myCar = Vehicle()
    val steeringWheel = Vehicle.SteeringWheel()
    val transmission = Vehicle.Transmission()

}

class Vehicle {

    var brand: String = "unknown"
    fun info() = println(brand)

    class SteeringWheel {
        var name: String = "Steering Wheel"
        fun info() = println(name)
    }

    class Transmission {
        var type = "Automatic"
        fun info() = println("The vehicle has shifted")
    }
}

