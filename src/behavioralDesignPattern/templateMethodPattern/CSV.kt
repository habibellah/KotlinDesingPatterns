package behavioralDesignPattern.templateMethodPattern

class CSV : File, FileReaderTemplate() {

    override fun parseTheFile() {
      println("the file is parsed as csv")
    }

    override fun parseFile() {
     parseTheFile()
    }
}