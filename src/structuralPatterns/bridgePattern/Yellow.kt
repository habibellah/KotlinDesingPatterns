package structuralPatterns.bridgePattern
//this is the yellow color who implement IColor interface will colored the shape with yellow
class Yellow : IColor{
    override fun colored(): String = "Yellow"
}