package ru.martynov.pobserver

class MainClass {
}

fun main(){
    val qiwi=Company("Qiwi")
    val alex=User("Alex")
    val milk = Product("Milk",100)
    val bread = Product("Bread",30)
    ProductEventManager.subscribe(ProductEventType.CHANGE_PRICE,milk,qiwi)
    ProductEventManager.subscribe(ProductEventType.CHANGE_PRICE,milk,alex)
    ProductEventManager.subscribe(ProductEventType.CHANGE_PRICE,bread,alex)
    ProductEventManager.subscribe(ProductEventType.APPEAR,bread,alex)
    bread.changeCount(10)
    bread.changePrice(35)
    milk.changePrice(200)
    bread.changeCount(20)
    bread.changeCount(0)
    bread.changeCount(40)

    println("ok")
}