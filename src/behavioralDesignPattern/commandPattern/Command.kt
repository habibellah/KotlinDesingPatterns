package behavioralDesignPattern.commandPattern
/*
this is the shared interface between devices and has two method execute and unExecute
 */
interface Command {
    fun execute()
    fun unExecute()
}