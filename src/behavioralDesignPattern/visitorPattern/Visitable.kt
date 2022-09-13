package behavioralDesignPattern.visitorPattern
//the visitable will implement by the products who will get to accept to add taxes
interface Visitable {
    fun accept(visitor:Visitor)
}