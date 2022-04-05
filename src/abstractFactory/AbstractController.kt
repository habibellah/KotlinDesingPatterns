package abstractFactory

 class AbstractController : IAbstractFactory{
  override fun getVehicleBuy(vehicle: String): VehiclesBuy? {
   return when(vehicle) {
    "Car" -> Car()
    "Truck" -> Truck()
    "MotorCycle" -> Motorcycle()
    else -> null
   }
  }

  override fun getPaymentWay(payment: String):PaymentWay? {
   return when(payment) {
    "Ccp" -> Ccp()
    "Visa" -> Visa()
    "Paysera" -> Paysera()
    else -> null
   }
  }
 }