package behavioralDesignPattern.observerPattern

class EmailListener(private val file:File) : SubscriberEventListener{
    override fun update(event: String) {
        println("i know that there is changes it is $event")
    }

}