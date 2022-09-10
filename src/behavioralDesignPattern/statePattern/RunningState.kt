package behavioralDesignPattern.statePattern
//second state(concrete class of states)
class RunningState : RunState{

    lateinit var context: Context



    override fun explainState() {
        println(" iam running ")
    }
}