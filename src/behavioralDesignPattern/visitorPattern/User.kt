package behavioralDesignPattern.visitorPattern

/*
in this program we implement the visitor pattern by adding a new functionality it is taxes
 */
fun main() {
    val car = Car(300.300)
    val apple = Apple(10.20)
    val visitor: Visitor = VisitorTaxes()

    println("price of car before taxes is " + car.price)
    visitor.visit(car)
    println("price of car after taxes is " + car.price)


    println("price of apple before taxes is " + apple.price)
    visitor.visit(apple)
    println("price of apple after taxes is " + apple.price)
}