package behavioralDesignPattern.visitorPattern
//concrete class of visitor who will add taxes if you want to add
//other functionality just new class implement the visitor
class VisitorTaxes : Visitor{
    override fun visit(car: Car) {
        car.price = car.price * 1.2
    }

    override fun visit(apple: Apple) {
       apple.price = apple.price * 1.5
    }
}