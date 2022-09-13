package behavioralDesignPattern.visitorPattern

class Apple(var price:Double) : Visitable{
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}