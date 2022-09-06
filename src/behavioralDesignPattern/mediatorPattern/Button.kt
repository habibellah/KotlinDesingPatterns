package behavioralDesignPattern.mediatorPattern
//concrete class of component
class Button(iMediator: IMediator) : Component(iMediator) {

    fun buttonClicked()
    {
     iMediator.notifyComponent(this,"the button is clicked")
    }
}