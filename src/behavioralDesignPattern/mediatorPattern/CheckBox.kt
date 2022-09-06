package behavioralDesignPattern.mediatorPattern
//concrete class of component
class CheckBox(iMediator: IMediator) : Component(iMediator) {

    fun checkBoxChecked()
    {
         iMediator.notifyComponent(this,"the check box is checked")
    }
}