package structuralPatterns.facadePattern
/*
this programme implement the facade pattern by using ShapeMakerFacade and with it the class does not
depend on many classes
 */
fun main() {
    val shapeMaker = FacadeShapeMaker()
    shapeMaker.drawRectangle()
    shapeMaker.drawCircle()
    shapeMaker.drawSquare()
}