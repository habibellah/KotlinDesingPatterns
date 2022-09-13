package behavioralDesignPattern.visitorPattern

class Car(var price:Double):Visitable {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}