package singletonPattern

/*
this class of person here we will implement the singleton pattern
in kotlin just you need to change the key word class to object ,and we will implement the singleton
 */
object Person{
    var name = "empty"
    var age = 0
    fun printNameAge()
    {
         println("the age and the name is : $name $age")
    }
}