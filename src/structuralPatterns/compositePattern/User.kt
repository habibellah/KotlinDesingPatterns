package structuralPatterns.compositePattern
/*
this example is a programme to show price and name of products
why we use composite pattern because the products here is inside boxes
,and maybe we can find a box inside a box ,so we use it
 */
fun main() {
    val p1 = Product("laptop",4000)
    val p2 = Product("Ram",40)
    val b1 = Box()
    b1.addProduct(p1)
    b1.addProduct(p2)

    val p3 = Product("Book",13)
    val p4 = Product("pen",2)
    val b2 = Box()
    b2.addProduct(p3)
    b2.addProduct(p4)

    val p5 = Product("mobile",2000)
    val mainBox = Box()
    mainBox.addProduct(b1)
    mainBox.addProduct(b2)
    mainBox.addProduct(p5)
    mainBox.showProductPrice()

}