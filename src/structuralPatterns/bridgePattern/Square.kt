package structuralPatterns.bridgePattern
//Square class extends shape class and implement the drawShape method with its properties and color
class Square(color: IColor) : Shape(color) {
    override fun drawShape() {
        println("iam a Square with ${super.color.colored()} color")
    }
}