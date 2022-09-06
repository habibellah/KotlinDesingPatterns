package creationalDesignPattern.factoryMethod
//this class is one of the concrete class who implement the interface of transport vehicle
// of your trip and this class define the Boat
class Boat : TransportTrip {
    override fun transportWay() {
        println("you will use a Boat for your Trip")
    }
}