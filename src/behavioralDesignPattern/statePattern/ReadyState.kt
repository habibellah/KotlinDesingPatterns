package behavioralDesignPattern.statePattern
//first state(concrete class of states)
class ReadyState : RunState{

    lateinit var context: Context



    override fun explainState() {
        println("iam ready to run")
    }
}