package ru.martynov.pobserver

object ProductEventManager {
    val listeners = mutableMapOf<Pair<ProductEventType,Product>,MutableList<ProductEventListener>>()

    fun OnProductEvent (productEvent:ProductEvent){
        listeners[Pair(productEvent.eventType,productEvent.product)]?.forEach{it.OnProductEvent(productEvent)}
    }

    fun subscribe(eventType:ProductEventType,product:Product,listener: ProductEventListener){
        if (listeners[Pair(eventType,product)] != null)
            listeners[Pair(eventType,product)]?.add(listener)
        else
            listeners[Pair(eventType,product)] = mutableListOf(listener)
    }

    fun unsubscribe(eventType:ProductEventType,product:Product,listener: ProductEventListener){
        listeners[Pair(eventType,product)]?.remove(listener)
    }

}