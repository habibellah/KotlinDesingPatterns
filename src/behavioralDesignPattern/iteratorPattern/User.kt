package behavioralDesignPattern.iteratorPattern
/*
this program implement the iterator pattern because there two restaurant want to be one but one of them
the menu is built using array and the another built using array list
 */
fun main() {
   val dinnerMenu = DinnerMenu()
   val penCakeHouseMenu = PenCakeHouseMenu()

   val waitress = Waitress(dinnerMenu,penCakeHouseMenu)
   waitress.printMenu()
}