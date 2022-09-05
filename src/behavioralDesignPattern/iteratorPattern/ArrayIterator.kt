package behavioralDesignPattern.iteratorPattern
/*
concrete class of iterator implement its methods with a special code the iterator loop all items
on the menu this concrete class to use iterator with array collections
 */
class ArrayIterator(private var list: Array<Any?>) : Iterator{

    private var position = 0

    override fun hasNext(): Boolean {
       return position < list.size
    }

    override fun next(): Any {
      val temp = list[position]
        position++
        return temp!!
    }
}