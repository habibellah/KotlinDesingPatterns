package structuralPatterns.bridgePattern
//this is the green color who implement IColor interface will colored the shape with green
class Green : IColor{
    override fun colored(): String = "Green"
}