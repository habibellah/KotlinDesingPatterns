package behavioralDesignPattern.chainOfResponsibility
//concrete class of handler the div operation
class Division : OperationHandler {

    private lateinit var nextHandler: OperationHandler
    override fun calculate(request: Request) {
        if(request.operation == '/')
        {
            println("multiplication ${request.numberOne * request.numberTwo}")
        }else{
          println("we do not support this operation")
        }
    }

    override fun nextHandler(operationHandler: OperationHandler) {
        this.nextHandler = operationHandler
    }
}