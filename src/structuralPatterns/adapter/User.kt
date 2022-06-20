package structuralPatterns.adapter
/*
this example is to wrap from the kilo meter to the Meter using the adapter pattern
 */
fun main() {
    val kiloMeters = KiloMeters()
    val adapter = Adapter()
    val meters1 = adapter.adaptToMeters(kiloMeters = kiloMeters)
    println("the data in kilo meter before the adapt "+kiloMeters.getInKilo())
    println("the data in meter after the adapt "+meters1.meters)

}
