package behavioralDesignPattern.chainOfResponsibility
//this interface has two methods calculate or pass to the next handler
interface OperationHandler {
    fun calculate(request:Request)
    fun nextHandler(operationHandler: OperationHandler)
}