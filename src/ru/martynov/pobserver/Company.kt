package ru.martynov.pobserver

class Company(val name:String):ProductEventListener {
    override fun OnProductEvent(productEvent: ProductEvent) {
        when (productEvent) {
            is ProductEventChangePrice -> println("Company $name now about change price: ${productEvent.product.name}  old price ${productEvent.oldPrice} new price ${productEvent.newPrice}}")
            is ProductEventAppear -> println("Company $name now about what product ${productEvent.product.name} appear")
        }
    }
}