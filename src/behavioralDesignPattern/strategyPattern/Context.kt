package behavioralDesignPattern.strategyPattern

class Context {
    private lateinit var strategy: Strategy

    fun setStrategy(strategy: Strategy)
    {
        this.strategy = strategy
    }

    fun executeStrategyOperation(a:Int ,b:Int):Int{
        return strategy.execute(a,b)
    }
}