package behavioralDesignPattern.mediatorPattern
//mediator interface two make reusable code
interface IMediator {
    fun notifyComponent(component: Component)
}