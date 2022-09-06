package behavioralDesignPattern.mediatorPattern
//concrete class of component
class CheckBox : Component() {

    fun checkBoxChecked()
    {
         iMediator.notifyComponent(this)
    }
}