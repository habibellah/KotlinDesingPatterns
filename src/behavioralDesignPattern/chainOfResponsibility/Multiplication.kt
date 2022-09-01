package behavioralDesignPattern.chainOfResponsibility
//concrete class of handler the mul operation
class Multiplication : OperationHandler {

    private lateinit var nextHandler: OperationHandler
    override fun calculate(request: Request) {
        if(request.operation == '*')
        {
            println("multiplication ${request.numberOne * request.numberTwo}")
        }else{
            nextHandler.calculate(request)
        }
    }

    override fun nextHandler(operationHandler: OperationHandler) {
        this.nextHandler = operationHandler
    }
}