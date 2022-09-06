package behavioralDesignPattern.mediatorPattern
/*
in this program we have two component button and CheckBox we will avoid decoupling between them using
Mediator pattern ,and when an event happened only Mediator object knows to notify other component
*/
//mediator interface two make reusable code
interface IMediator {
    fun notifyComponent(component: Component,event:String)
}