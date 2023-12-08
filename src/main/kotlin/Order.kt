class Order(private val cart: Cart) {

    fun confirmOrder() {
        println("주문 내역:")
        cart.getItems().forEach { product ->
            println("${product.name}: ₩${product.price}")
        }
        println("총 금액: ₩${cart.getTotalPrice()}")
        if(isOrderCompleted()){
            SalesData.addSale(cart.getItems())
            println("주문이 완료되었습니다. 3초후에 메인 메뉴로 돌아갑니다.")
            cart.clear()
        }else{
            println("메인 메뉴로 돌아갑니다. 3초후에 메인 메뉴로 돌아갑니다")
        }

    }
    private fun isOrderCompleted(): Boolean {
        println("주문을 완료할까요? 1을 입력하시면 주문완료가 되고 2를 입력하시면 메인 메뉴로 돌아갑니다.")
        return when (readln()) {
            "1" -> true
            "2" -> false
            else -> {
                println("1번이나 2번을 입력해주세요.")
                return isOrderCompleted()
            }
        }
    }

}