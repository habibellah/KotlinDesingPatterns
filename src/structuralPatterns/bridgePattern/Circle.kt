package structuralPatterns.bridgePattern
//Circle class extends shape class and implement the drawShape method with its properties and color
class Circle(color: IColor) : Shape(color) {
    override fun drawShape() {
        println("iam a Circle with ${super.color.colored()} color")
    }
}