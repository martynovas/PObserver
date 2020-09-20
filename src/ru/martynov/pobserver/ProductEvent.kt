package ru.martynov.pobserver

open class ProductEvent(val eventType: ProductEventType,val product:Product) {
    fun happend() {
        ProductEventManager.OnProductEvent(this)
    }
}