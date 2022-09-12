package behavioralDesignPattern.templateMethodPattern
/*
this program is reading different formats of a file(doc ,pdf ,csv) we implement template method
because there are many similar code in these program
 */
fun main() {
    val pdf = PDF()
    pdf.openFile(34)
    val csv = CSV()
    csv.openFile(40)
}