package structuralPatterns.compositePattern
//product class implement ProductPrice interface the method show the price and the name of the product
class Product(private val name:String, private val price:Int) : ProductPrice{
    override fun showProductPrice() {
        println("the product is ${this.name}  the price is ${this.price}")
    }

}