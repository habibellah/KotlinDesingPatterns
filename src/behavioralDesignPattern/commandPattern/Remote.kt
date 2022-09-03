package behavioralDesignPattern.commandPattern
/*
the remote class has two buttons on and off his job implement to execute and unExecute methods of the command interface
the remote do not know methods of command what does it call the Invoker
 */
class Remote (private val onCommand: Command,private val offCommand: Command){
    private lateinit var undoCommand: Command

    fun onButtonClick()
    {
        onCommand.execute()
        this.undoCommand = onCommand
    }

    fun offButtonClick()
    {
        offCommand.execute()
        this.undoCommand = offCommand
    }

    fun undoButton()
    {
        this.undoCommand.unExecute()
    }
}