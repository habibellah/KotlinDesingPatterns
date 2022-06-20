package structuralPatterns.adapter
//this interface for the adapter implementation
interface MetersAdapter {
    fun adaptToMeters(kiloMeters: KiloMeters):Meters
}