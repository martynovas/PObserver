package ru.martynov.pobserver

class User(val FIO:String):ProductEventListener {
    override fun OnProductEvent(productEvent: ProductEvent) {
        when (productEvent) {
            is ProductEventChangePrice -> println("User $FIO now about change price: ${productEvent.product.name}  old price ${productEvent.oldPrice} new price ${productEvent.newPrice}}")
            is ProductEventAppear -> println("User $FIO now about what product ${productEvent.product.name} appear")
            is ProductEventBargain -> println("User $FIO now about what product have bargain ${productEvent.bargainDiscount}")
        }
    }
}