package structuralPatterns.proxyPattern
//this class like a db get from it the data it is books
object BookList {
    fun getListOfBooks():ArrayList<Book>{
        val listOfBooks = ArrayList<Book>()
        listOfBooks.add(Book("clean code",400))
        listOfBooks.add(Book("clean architecture",500))
        listOfBooks.add(Book("steal like an artist",190))
        return listOfBooks
    }
}