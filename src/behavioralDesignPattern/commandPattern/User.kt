package behavioralDesignPattern.commandPattern
/*
this program is about a remote control and the light of the room we implemented the command pattern
when the user click in on button in the remote the light will be on and off will be off
 */
fun main() {
    val light = Light()

    val onCommand = LightOnCommand(light)
    val offCommand = LightOffCommand(light)

    val remote = Remote(onCommand,offCommand)


    remote.onButtonClick()
    remote.offButtonClick()
    remote.undoButton()
}