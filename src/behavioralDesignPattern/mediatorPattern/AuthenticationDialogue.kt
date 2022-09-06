package behavioralDesignPattern.mediatorPattern
//this is the concrete class of IMediator where its object make connection with all component to avoid
//coupling between components
class AuthenticationDialogue : IMediator{
    override fun notifyComponent(component: Component,event:String) {
        if(component is Button)
        {
            buttonIsClicked(event)
        }else if(component is CheckBox)
        {
            checkBoxIsChecked(event)
        }
    }

    private fun buttonIsClicked(event: String)
    {
        println(event)
    }

    private fun checkBoxIsChecked(event: String)
    {
        println(event)
    }
}