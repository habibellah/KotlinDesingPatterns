package behavioralDesignPattern.iteratorPattern
//iterator has two necessary methods has next and the next itself
interface Iterator {
    fun hasNext():Boolean
    fun next():Any
}