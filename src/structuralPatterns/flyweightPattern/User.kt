package structuralPatterns.flyweightPattern
/*
this programme who implements the flyweight pattern get a Product and then take its Discount
using factory there are two types of discounts of day and of the month and their we implement the flyweight
when the programme do not need to make a new object of one of the discounts if there are exist before
 */
fun main() {
val clothesPrice = 500.0f
    println("the value of discount is ${DiscountFactory.getDiscountFactory("month")!!.discountValue() * clothesPrice}")
}