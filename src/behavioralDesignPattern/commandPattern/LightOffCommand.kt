package behavioralDesignPattern.commandPattern
//this is the concrete class of command where we will implement its methods by execute (off) and unExecute(on)
class LightOffCommand (private val light: Light): Command{

    override fun execute() {
        light.turnOff()
    }

    override fun unExecute() {
       light.turnOn()
    }
}