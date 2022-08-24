package structuralPatterns.proxyPattern
/*
the proxy book class we implement on it the proxy pattern it is the class who will
communicate with the user and create the book db object only when the user need it
 */
class ProxyBook : IBook {

    private var bookDb:BookDB? = null
    override fun getNumberOfPagesOfBook(nameOfBook: String): Int {
        if(bookDb == null)
        {
            bookDb = BookDB()
        }
        return this.bookDb!!.getNumberOfPagesOfBook(nameOfBook)
    }
}