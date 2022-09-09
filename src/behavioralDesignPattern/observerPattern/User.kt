package behavioralDesignPattern.observerPattern
/*
this program implement observer Pattern by use an textEditor when any file changes its state
,other concrete classes will be notified about changes
 */
fun main() {
    val file1 = File("this is file 1")

    val editor = Editor()

    val emailListener = EmailListener(file1)

    editor.subscribe(emailListener)
    editor.setNewFileInfo(file1)
}