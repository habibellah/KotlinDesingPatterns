package creationalDesignPattern.protoType
/*
this example of our prototype pattern is about shapes we have for example one rectangle
,and we want to create new one with the same properties
we use prototype pattern with clone method will create new one without create it from zero and maybe
take time in other programmes for example take data from DB
 */
fun main() {

val r1 = Rectangle()
r1.high = 20
    r1.width = 10
    val r2 = r1.clone() as Rectangle
    println("the high and the width of r2 is: ${r1.high} ${r1.width}")
    println("the high and the width of r2 is: ${r2.high} ${r2.width}")

}

