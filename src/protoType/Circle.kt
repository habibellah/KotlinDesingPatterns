package protoType
/*
this one of the concrete classes call circle ,and it implements the IShape interface ,so it will override
the clone method who will return and obj of the same properties (radius)of circle in a new one
 */
class Circle() : IShape{
     var radius:Int = 0

    constructor(circle: Circle):this()
    {
        this.radius = circle.radius
    }

    override fun clone(): IShape {
        return Circle(this)
    }
}