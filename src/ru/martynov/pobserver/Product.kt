package ru.martynov.pobserver

class Product(val name:String,var price:Int) {
    var count:Int=0
    var bargainDiscount:Int=0

    fun changePrice(newPrice:Int){
        val oldPrice=price
        price=newPrice
        ProductEventChangePrice(this,oldPrice,newPrice).happend()
    }
    fun changeCount(newCount:Int){
        val oldCount = count
        count=newCount
        if (oldCount==0 && newCount>0) ProductEventAppear(this).happend()

    }

    fun setDiscount(newDiscount:Int){
        bargainDiscount=newDiscount
        ProductEventBargain(this,bargainDiscount).happend()
    }
}