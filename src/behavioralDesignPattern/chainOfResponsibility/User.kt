package behavioralDesignPattern.chainOfResponsibility
/*
this program implements the chain of responsibility  pattern by get two numbers and type of operation
from the user and then add it to the handler to see if it can handle it or pass it to the next
operation (handler)
 */
fun main() {
    val request = Request(4,6,'-')
    val receiver = Receiver()
    receiver.sendRequest(request)
}