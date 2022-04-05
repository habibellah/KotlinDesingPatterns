package abstractFactory

fun main() {
    val abstractController = AbstractController()
    val payment = abstractController.getPaymentWay("Ccp")
    val vehicle = abstractController.getVehicleBuy("Truck")
    vehicle!!.buy()
    payment!!.pay()
}