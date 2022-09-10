package behavioralDesignPattern.statePattern
//third state(concrete class of states)
class FinishState : RunState{

    private lateinit var context: Context



    override fun explainState() {
        println("i finished")
    }
}