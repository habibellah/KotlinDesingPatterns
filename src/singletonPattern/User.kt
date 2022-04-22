package singletonPattern
/*
in this example of singleton we will make a programme who make a person class and will give him an age and a name
,and we will note that in kotlin if we need to implement the singleton just we need to change the class key work
to object ,and we will be a singleton ,and we can work with it from calling the name of the object (the class before)
 */
fun main() {
    Person.age = 19
    Person.name = "habibellah"
Person.printNameAge()
}