package creationalDesignPattern.builderPattern
/*
we can call the Director class by the controller it will control the construct or building steps
and give the final result
 */
class Director
{

    private lateinit var builderVehicle:IBuilder
     fun constructVehicle(builderVehicle1 : IBuilder)
    {
        this.builderVehicle = builderVehicle1
        builderVehicle1.startBuildVehicle()
        builderVehicle1.buildBody()
        builderVehicle1.insertWheels()
        builderVehicle1.addHeadLights()
        builderVehicle1.endBuildVehicle()
    }
}