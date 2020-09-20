package ru.martynov.pobserver

class ProductEventChangePrice(product:Product, val oldPrice:Int,val newPrice:Int):ProductEvent(ProductEventType.CHANGE_PRICE,product) {
}