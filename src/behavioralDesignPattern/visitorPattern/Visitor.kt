package behavioralDesignPattern.visitorPattern
//visitor has multiple product who will visit this to avoid conditions
interface Visitor {
    fun visit(car:Car)
    fun visit(apple:Apple)
}