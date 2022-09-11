package behavioralDesignPattern.strategyPattern

class Division : Strategy {
    override fun execute(a: Int, b: Int): Int {
        return a / b
    }
}