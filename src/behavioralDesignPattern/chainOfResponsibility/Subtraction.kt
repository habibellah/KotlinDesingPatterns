package behavioralDesignPattern.chainOfResponsibility
//concrete class of handler the sub operation
class Subtraction : OperationHandler {

    private lateinit var nextHandler: OperationHandler
    override fun calculate(request: Request) {
        if(request.operation == '-')
        {
            println("subtraction ${request.numberOne - request.numberTwo}")
        }else{
            nextHandler.calculate(request)
        }
    }

    override fun nextHandler(operationHandler: OperationHandler) {
        this.nextHandler = operationHandler
    }
}