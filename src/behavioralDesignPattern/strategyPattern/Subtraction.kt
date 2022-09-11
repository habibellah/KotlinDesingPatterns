package behavioralDesignPattern.strategyPattern

class Subtraction : Strategy {
    override fun execute(a: Int, b: Int): Int {
       return a - b
    }
}