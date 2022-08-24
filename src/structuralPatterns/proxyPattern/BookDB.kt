package structuralPatterns.proxyPattern
//this is the original class of getting book info we consider it as a massive class use big resources, so we use proxy
class BookDB : IBook{
    private val listOfBooks = BookList.getListOfBooks()
    override fun getNumberOfPagesOfBook(nameOfBook : String): Int {
        for(i in 0 until listOfBooks.size)
        {
            if (listOfBooks[i].name == nameOfBook){
                return listOfBooks[i].numberOfPages
            }
        }
        return 0
    }


}