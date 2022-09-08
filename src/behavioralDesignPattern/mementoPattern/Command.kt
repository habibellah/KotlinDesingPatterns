package behavioralDesignPattern.mementoPattern

class Command {
    private lateinit var editor: Editor
    private  var backUp: SnapShot? = null

    fun createBackUp()
    {
        this.backUp = editor.createSnapShot()
    }

    fun undo()
    {
        if (backUp != null){
          backUp!!.restore()
        }
    }
}