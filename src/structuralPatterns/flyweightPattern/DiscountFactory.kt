package structuralPatterns.flyweightPattern

import java.util.HashMap
/*
here we implement two patterns almost time the fly weight pattern come with factory method
we made a hashMap like a small memory in our programme we store in it types of the discounts
if the user already take it and here is the flyweight
 */
object DiscountFactory {
    private val discounts = HashMap<String, IDiscount>()
    private var discountTime: IDiscount? = null
    fun getDiscountFactory(discountType: String): IDiscount? {
        return if (discounts.containsKey(discountType)) {
            discounts[discountType]
        } else {
            when (discountType) {
                "day" -> {
                    discountTime = DayDiscount()
                    discounts[discountType] = discountTime as DayDiscount
                }

                "month" -> {
                    discountTime = MonthDiscount()
                    discounts[discountType] = discountTime as MonthDiscount
                }
            }
            discountTime
        }
    }
}