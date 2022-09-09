package behavioralDesignPattern.observerPattern

class Editor {

    var subscribers = ArrayList<SubscriberEventListener>()


    fun subscribe(subscriber: SubscriberEventListener) {
        subscribers.add(subscriber)
    }

    fun unsubscribe(subscriber: SubscriberEventListener) {
        subscribers.remove(subscriber)
    }


    private fun notified(file: File) {
        for (i in subscribers.indices) {
            subscribers[i].update(file.text)
        }
    }

    fun setNewFileInfo(file: File) {
        file.text = "new text added on file 1"
        notified(file)
    }

}