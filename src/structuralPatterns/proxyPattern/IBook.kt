package structuralPatterns.proxyPattern
//this interface for implement the proxy pattern will implement it in the proxy class and with the original class
interface IBook {
    fun getNumberOfPagesOfBook(nameOfBook : String):Int
}