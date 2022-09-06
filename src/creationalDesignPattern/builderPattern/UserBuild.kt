package creationalDesignPattern.builderPattern
/*
this example will know from it the builder pattern it will build a car
and this car has pieces ,and we implement the concept of the pattern by this example
 */
fun main() {
    val director =  Director()
    val build =  Car("Toyota")
    director.constructVehicle(build)
    val vehicle = build.getVehicle()
    vehicle.show()
}