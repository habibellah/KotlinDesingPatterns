package behavioralDesignPattern.mementoPattern

class SnapShot(private val editor:Editor,private val text:String) {

    public fun restore()
    {
        editor.text = text
    }


}