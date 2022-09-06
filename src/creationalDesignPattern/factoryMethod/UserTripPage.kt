package creationalDesignPattern.factoryMethod
/*
UserTripPage has the main methode, and we can define it as the user Class where he will choose one of the vehicle in the trip
without create new objects of these classes
 */
fun main() {
    val factory = Factory()
    val trip = factory.getFactoryVehicle("Boat")
    trip!!.transportWay()
}