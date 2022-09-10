package behavioralDesignPattern.statePattern
/*
this class it is the responsible ,of changing states over time
 */
class Context (private var runState: RunState){
    fun changeState(runState: RunState)
    {
        this.runState = runState
    }
    fun explainCurrentState()
    {
        this.runState.explainState()
    }
}