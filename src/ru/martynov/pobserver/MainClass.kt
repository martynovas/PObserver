package ru.martynov.pobserver

class MainClass {
}

fun main(){
    val qiwi=Company("Qiwi")
    val alex=User("Alex")
    val fedor=User("Fedor")
    val milk = Product("Milk",500)
    val bread = Product("Bread",30)
    val rice = Product("Rice", 50)
    ProductEventManager.subscribe(ProductEventType.CHANGE_PRICE,milk,qiwi)
    ProductEventManager.subscribe(ProductEventType.CHANGE_PRICE,milk,alex)
    ProductEventManager.subscribe(ProductEventType.CHANGE_PRICE,bread,alex)
    ProductEventManager.subscribe(ProductEventType.APPEAR,bread,alex)
    bread.changeCount(10)
    bread.changePrice(35)
    ProductEventManager.unsubscribe(ProductEventType.CHANGE_PRICE,bread,alex)
    bread.changePrice(45)
    milk.changePrice(200)
    bread.changeCount(20)
    bread.changeCount(0)
    bread.changeCount(40)

    ProductEventManager.subscribe(ProductEventType.BARGAIN,rice,fedor)
   /* ProductEventManager.subscribe(ProductEventType.BARGAIN,rice,alex)
    ProductEventManager.subscribe(ProductEventType.BARGAIN,rice,qiwi)*/
    rice.setDiscount(10)

    println("ok")
}