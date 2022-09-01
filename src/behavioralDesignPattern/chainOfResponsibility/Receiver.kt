package behavioralDesignPattern.chainOfResponsibility
//this class control all handlers and which handler will start with and its init
class Receiver{
    private var add:OperationHandler = Addition()
    private var sub:OperationHandler = Subtraction()
    private var mul:OperationHandler = Multiplication()
    private var div:OperationHandler = Division()

    init {

        add.nextHandler(sub)
        sub.nextHandler(mul)
        mul.nextHandler(div)
    }

    fun sendRequest(request: Request)
    {
        add.calculate(request)
    }
}