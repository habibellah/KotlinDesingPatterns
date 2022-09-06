package creationalDesignPattern.builderPattern
//Vehicle class we can call by the helper class it has the ability to add the pieces
//in an array list and show it just to understand the concept of builder Pattern
class Vehicle {

    private var plus:ArrayList<String> = ArrayList()

    fun addPieces(pieces: String)
    {
        plus.add(pieces)
    }
    fun show()
    {
        for(i in 0 until plus.size)
        {
            println(plus[i])
        }
    }
}