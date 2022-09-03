package behavioralDesignPattern.commandPattern
//this is the concrete class of command where we will implement its methods by execute(on) and unExecute(off)
class LightOnCommand (private val light: Light) : Command{
    override fun execute() {
        light.turnOn()
    }

    override fun unExecute() {
        light.turnOff()
    }
}