package creationalDesignPattern.builderPattern
/*
this concrete class will implement the IBuilder interface and here we can find
many concrete classes and implement the methods with its case in our example every concrete class,
 or we can say Car has a model and steps to build maybe you want to build a motorcycle
 */
class Car(private var model : String ) : IBuilder {
    private var vehicle:Vehicle = Vehicle()
    override fun startBuildVehicle() {
        vehicle.addPieces("the model is: " + this.model)
    }

    override fun buildBody() {

      vehicle.addPieces("body is built")
    }

    override fun insertWheels() {
       vehicle.addPieces("wheels is added")
    }

    override fun addHeadLights() {
       vehicle.addPieces("headlights is added")
    }

    override fun endBuildVehicle() {
        vehicle.addPieces("built is finished")
    }

    override fun getVehicle(): Vehicle {
        return vehicle
    }
}