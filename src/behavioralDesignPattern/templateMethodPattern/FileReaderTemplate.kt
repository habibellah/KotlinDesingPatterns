package behavioralDesignPattern.templateMethodPattern

abstract class FileReaderTemplate {

    fun openFile(lines: Int) {
        parseFile()
        sendReport()
        sendCountOfLines(lines)
    }

    abstract fun parseFile()

    //there are some similar methods we implement it on the abstract class
     fun sendReport() {
        println("the report is sent")
    }

     fun sendCountOfLines(lines: Int) {
        println("the count of lines is $lines")
    }

}