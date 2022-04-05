package abstractFactory

class Visa : PaymentWay{
    override fun pay() {
        println("you will pay using Visa")
    }
}