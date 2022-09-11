package behavioralDesignPattern.strategyPattern
/*
this program will take two numbers and the operation and implement the strategy pattern,
to choose the right operation
 */
fun main() {
    val context = Context()

    val addition: Strategy = Addition()

    context.setStrategy(addition)
    val result = context.executeStrategyOperation(4, 3)
    println(result)

    //other strategies

    //other strategies
    val division: Strategy = Division()
    context.setStrategy(division)
    val result2 = context.executeStrategyOperation(5, 5)
    println(result2)
}