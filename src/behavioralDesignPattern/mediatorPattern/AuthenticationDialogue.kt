package behavioralDesignPattern.mediatorPattern
//this is the concrete class of IMediator where its object make connection with all component to avoid
//coupling between components
class AuthenticationDialogue : IMediator{
    override fun notifyComponent(component: Component) {
        if(component is Button)
        {
            buttonIsClicked()
        }else if(component is CheckBox)
        {
            checkBoxIsChecked()
        }
    }

    private fun buttonIsClicked()
    {
        println("the button is clicked")
    }

    private fun checkBoxIsChecked()
    {
        println("the check box is Checked")
    }
}