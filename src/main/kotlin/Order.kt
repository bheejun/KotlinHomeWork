class Order(private val cart: Cart) {

    fun confirmOrder() {
        println("주문이 완료되었습니다.")
        println("주문 내역:")
        cart.getItems().forEach { product ->
            println("${product.name}: ₩${product.price}")
        }
        println("총 금액: ₩${cart.getTotalPrice()}")
        cart.clear()
    }
}