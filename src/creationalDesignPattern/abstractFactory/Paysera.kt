package creationalDesignPattern.abstractFactory

class Paysera :PaymentWay{
    override fun pay() {
        println("you will pay using Paysera")
    }
}