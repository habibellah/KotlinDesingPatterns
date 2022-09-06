package creationalDesignPattern.protoType
/*
this one of the concrete classes call Rectangle ,and it implements the IShape interface ,so it will override
the clone method who will return and obj of the same properties (width and high )of Rectangle in a new one
 */
class Rectangle():IShape {
    var width:Int = 0
    var high:Int = 0


    constructor(rectangle:Rectangle) : this(){
        this.width = rectangle.width
        this.high = rectangle.high
    }
    override fun clone(): IShape {
        return Rectangle(this)
    }
}