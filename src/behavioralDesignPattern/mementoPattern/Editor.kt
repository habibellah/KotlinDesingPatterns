package behavioralDesignPattern.mementoPattern

class Editor {
     lateinit var text:String
    fun createSnapShot():SnapShot{
        return SnapShot(this,text)
    }

}