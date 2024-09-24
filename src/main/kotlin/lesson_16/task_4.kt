package org.example.lesson_16

fun main() {
    sendRequestToChangeOrderStatus(Order(1), "ready")
}

class Order(
    private val id:Int,
){

    private var orderStatus:String = ""

    fun getOrderStatus():String = orderStatus

    fun changeOrderStatus(newStatus:String){
        orderStatus = newStatus
    }

}

fun sendRequestToChangeOrderStatus(order:Order, newStatus: String){
    order.changeOrderStatus(newStatus)
}