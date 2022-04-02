package factoryMethod
//this class is one of the concrete class who implement the interface of transport vehicle
// of your trip and this class define the Aero Plane
class AeroPlane : TransportTrip{
    override fun transportWay() {
        println("you will use an Aero plane for your trip")
    }
}