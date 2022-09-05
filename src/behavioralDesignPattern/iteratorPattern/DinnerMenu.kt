package behavioralDesignPattern.iteratorPattern
/*
this class calls the iterator methods from the concrete with a special code the iterator will loop all items
on the menu
 */
class DinnerMenu {

private  val  MAX_LENGTH = 6
  private var numberOfItems = 0
    private  var menuItems: Array<Any?> = arrayOfNulls(MAX_LENGTH)

    init {
        addItem("kouskous","it is an algerian food",true,3.3)
        addItem("shakhshouks","it is a Mesila food it is very hot",true,5.3)
        addItem("burgur","it is a sandwich of some ingredients",false,2.2)
        addItem("hot dog","with onions and meat and lotus",false,3.1)
        addItem("Rice","it is  food",true,3.0)
        addItem("water melon with meat","it is  food",false,4.2)
    }

     private fun addItem(name:String, description:String, vegetarian:Boolean, price:Double)
    {
        val menuItem = MenuItems(name,description,vegetarian ,price)
        if(MAX_LENGTH <= numberOfItems)
        {
            println("the menu is full")
        }else{
            menuItems[numberOfItems] = menuItem
            numberOfItems++
        }
    }

     fun getIterator(): Iterator {
        return ArrayIterator(menuItems)
    }
}