package behavioralDesignPattern.mediatorPattern
//concrete class of component
class Button : Component() {

    fun buttonClicked()
    {
     iMediator.notifyComponent(this)
    }
}