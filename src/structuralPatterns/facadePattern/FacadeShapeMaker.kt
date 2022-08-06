package structuralPatterns.facadePattern
//facade class to hide framework complexity by made all dependencies of what user need of classes

class FacadeShapeMaker{
    private var circle: Circle = Circle()
    private var rectangle: Rectangle = Rectangle()
    private var square: Square = Square()

    fun drawCircle()
    {
        circle.draw()
    }

    fun drawRectangle()
    {
        rectangle.draw()
    }

    fun drawSquare()
    {
        square.draw()
    }
}