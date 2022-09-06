package creationalDesignPattern.abstractFactory

interface IAbstractFactory {
    fun getVehicleBuy( vehicle : String):VehiclesBuy?
    fun getPaymentWay(payment: String):PaymentWay?
}