package structuralPatterns.compositePattern
/*
box class implement ProductPrice in a different way because it is the composite class where
we can find inside it another box or maybe product
 */
class Box : ProductPrice{
    private val productPrices = mutableListOf<ProductPrice>()

    fun addProduct(productPrice: ProductPrice)
    {
        productPrices.add(productPrice)
    }
    fun removeProduct(productPrice: ProductPrice)
    {
        productPrices.remove(productPrice)
    }

    override fun showProductPrice() {
        for(i in 0 until productPrices.size)
        {
            productPrices.get(i).showProductPrice()
        }
    }

}