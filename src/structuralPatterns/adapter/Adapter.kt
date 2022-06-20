package structuralPatterns.adapter
//the adapter implement MeterAdapter interface by the method adaptToMeter its job wrap from KIlo to Meter
class Adapter : MetersAdapter{
    override fun adaptToMeters(kiloMeters: KiloMeters): Meters {
        val meters = Meters()
        meters.meters = convertToMeter(kiloMeters.getInKilo())
        return meters
    }
    private fun convertToMeter(kiloM : Int):Int {
        return kiloM * 1000
    }

}