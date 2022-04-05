package abstractFactory

class Ccp : PaymentWay{
    override fun pay() {
        println("you will pay using Ccp")
    }
}