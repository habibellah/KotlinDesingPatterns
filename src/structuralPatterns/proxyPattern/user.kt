package structuralPatterns.proxyPattern
/*
in this program with put a name of a book and get its number of pages,
and we implement it using proxy design pattern
 */
fun main() {
val proxyBook = ProxyBook()
    println(proxyBook.getNumberOfPagesOfBook("clean code"))
    println(proxyBook.getNumberOfPagesOfBook("steal like an artist"))
}