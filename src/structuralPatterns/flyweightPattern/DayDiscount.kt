package structuralPatterns.flyweightPattern
//day discount has 0.25 discount of the real value of the product you take
class DayDiscount:IDiscount {
    override fun discountValue() = 0.25f
}