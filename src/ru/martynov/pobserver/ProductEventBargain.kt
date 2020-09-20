package ru.martynov.pobserver

class ProductEventBargain(product:Product, val bargainDiscount:Int):ProductEvent(ProductEventType.BARGAIN,product) {
}