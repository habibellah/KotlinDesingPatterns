package creationalDesignPattern.builderPattern
//the builder interface has the methods we need to build the car
interface IBuilder {

    fun startBuildVehicle()
    fun buildBody()
    fun insertWheels()
    fun addHeadLights()
    fun endBuildVehicle()
    fun getVehicle():Vehicle
}