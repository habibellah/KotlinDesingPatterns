package behavioralDesignPattern.templateMethodPattern

class PDF : File, FileReaderTemplate() {

    override fun parseTheFile() {
        println("the file is parsed as pdf")
    }

    override fun parseFile() {
        parseTheFile()
    }
}