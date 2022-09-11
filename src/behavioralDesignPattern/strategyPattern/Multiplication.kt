package behavioralDesignPattern.strategyPattern

class Multiplication : Strategy {
    override fun execute(a: Int, b: Int): Int {
        return a * b
    }
}