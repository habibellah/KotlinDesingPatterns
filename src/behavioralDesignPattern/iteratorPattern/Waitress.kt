package behavioralDesignPattern.iteratorPattern

/*
this class is responsible to show the two menus using iterator and do not care
what is the collection use in witch menu come
 */
class Waitress(private val dinnerMenu: DinnerMenu, private val penCakeHouseMenu: PenCakeHouseMenu) {


    fun printMenu() {
        val dinnerIterator = dinnerMenu.getIterator()
        val penCakeHouseIterator = penCakeHouseMenu.getIterator()
        printMenu(dinnerIterator)
        printMenu(penCakeHouseIterator)
    }

    private fun printMenu(iterator: Iterator) {
        while (iterator.hasNext()) {
            println((iterator.next() as MenuItems).name)
        }
    }
}