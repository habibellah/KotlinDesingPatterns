package creationalDesignPattern.factoryMethod
//this class define the factory method getFactoryVehicle return object
// for one of the concrete classes of vehicle you use in your trip
class Factory {

    fun getFactoryVehicle(vehicle :String): TransportTrip?
    {
        return when(vehicle)
        {
            "Car" -> Car()
            "Boat" -> Boat()
            "AeroPlane" -> AeroPlane()
            else -> null
        }
    }
}