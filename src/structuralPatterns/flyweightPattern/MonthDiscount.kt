package structuralPatterns.flyweightPattern
//month discount has 0.5 discount of the real value of the product you take
class MonthDiscount:IDiscount {
    override fun discountValue() = 0.5f
}