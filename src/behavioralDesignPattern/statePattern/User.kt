package behavioralDesignPattern.statePattern

/*
this program implement the state pattern by there is a person will run ,so he has three state
first ready second running third done or finish running
 */
fun main() {
    val readyState = ReadyState()
    val runningState = RunningState()
    val finishState = FinishState()


    val context = Context(readyState)
    context.explainCurrentState()
    //the concrete class itself can change state by using a context object
    //the concrete class itself can change state by using a context object
    readyState.context = context
    readyState.context.changeState(runningState)
    context.explainCurrentState()
    runningState.context = context
    runningState.context.changeState(finishState)
    context.explainCurrentState()
}