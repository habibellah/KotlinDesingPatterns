package behavioralDesignPattern.strategyPattern

class Addition : Strategy {
    override fun execute(a: Int, b: Int): Int {
        return a + b
    }
}