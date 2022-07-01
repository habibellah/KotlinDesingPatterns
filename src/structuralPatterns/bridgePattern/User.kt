package structuralPatterns.bridgePattern
/*
this example is a programme of drawing Shaped with a different Colors
using Bridge Pattern
 */
fun main() {
val yellow = Yellow()
val green = Green()
val square = Square(green)
val square1 = Square(yellow)
val circle = Circle(yellow)
square.drawShape()
circle.drawShape()
square1.drawShape()
}