import product.bread.Baguette
import product.bread.Croissant
import product.bread.Focaccia
import product.coffee.*
import product.tea.BlackTea
import product.tea.GreenTea
import product.tea.OolongTea


fun main(){
    val cart = Cart()
    var running = true

    while (running){
        displayMainMenu()

        println("번호를 입력해 주세요")
        val choice = readln()
        when(choice){
            "0" -> {
                SalesData.displayTotalSales()
                SalesData.displaySoldProducts()
            }
            "1" -> displayCoffeeMenu(cart)
            "2" -> displayBreadMenu(cart)
            "3" -> displayTeaMenu(cart)
            "4" -> processOrder(cart)
            "5" -> cancelOrder(cart)

            "exit" -> running = false

            else -> println("잘못 선택하셨습니다. 다시 선택해 주세요")

        }
    }
}

fun displayMainMenu() {
    println("“카페에 오신걸 환영합니다.”")
    println("아래의 메뉴를 보고 골라주세요.\n")

    println("[ CAFE MENU ]")
    println("1. 커피 | 신선한 과테말라 산 원두를 사용한 커피메뉴")
    println("2. 빵 | 풍미가 좋은 빵메뉴")
    println("3. 차 | 향긋한 차 메뉴")
    println("[ ORDER MENU ]")
    println("4. 주문 | 장바구니를 확인하고 주문합니다.")
    println("5. 취소 | 주문을 취소하고 싶으면 골라주세요.\n")
}

fun displayCoffeeMenu(cart: Cart) {

    println("[ 커피메뉴 ]")
    println("1. ${Americano.name} | W ${Americano.price} | ${Americano.description}")
    println("2. ${DecafAmericano.name} | W ${DecafAmericano.price} | ${DecafAmericano.description}")
    println("3. ${Espresso.name} | W ${Americano.price} | ${Americano.description}")
    println("4. ${IcedAmericano.name} | W ${IcedAmericano.price} | ${IcedAmericano.description}")
    println("5. ${Latte.name} | W ${Latte.price} | ${Latte.description}")
    println("메뉴 번호를 선택하세요 (예: 1 3 5), 메뉴로 돌아가려면 'back'을 입력하세요: ")

    val input = readln()
    input.split(" ").forEach { choice ->
        when (choice) {
            "1" -> {
                val americano = Americano()
                cart.addProduct(americano)
                println("${Americano.name}가 장바구니에 추가되었습니다.")
            }

            "2" -> {
                val decafAmericano = DecafAmericano()
                cart.addProduct(decafAmericano)
                println("${DecafAmericano.name}가 장바구니에 추가되었습니다.")
            }

            "3" -> {
                val espresso = Espresso()
                cart.addProduct(espresso)
                println("${Espresso.name}가 장바구니에 추가되었습니다.")
            }

            "4" -> {
                val icedAmericano = IcedAmericano()
                cart.addProduct(icedAmericano)
                println("${IcedAmericano.name}가 장바구니에 추가되었습니다.")
            }

            "5" -> {
                val latte = Latte()
                cart.addProduct(latte)
                println("${Latte.name}가 장바구니에 추가되었습니다.")
            }
            "back" -> return
        }
    }
}

fun displayBreadMenu(cart: Cart){
    println("[ 빵 메뉴 ]")
    println("1. ${Baguette.name} | W ${Baguette.price} | ${Baguette.description}")
    println("2. ${Croissant.name} | W ${Croissant.price} | ${Croissant.description}")
    println("3. ${Focaccia.name} | W ${Focaccia.price} | ${Focaccia.description}")
    println("메뉴 번호를 선택하세요 (예: 1 3 5), 메뉴로 돌아가려면 'back'을 입력하세요: ")

    val input = readln()
    input.split(" ").forEach { choice ->
        when (choice) {
            "1" -> {
                val baguette = Baguette()
                cart.addProduct(baguette)
                println("${Baguette.name}가 장바구니에 추가되었습니다.")
            }

            "2" -> {
                val croissant = Croissant()
                cart.addProduct(croissant)
                println("${Croissant.name}가 장바구니에 추가되었습니다.")
            }

            "3" -> {
                val focaccia = Focaccia()
                cart.addProduct(focaccia)
                println("${Focaccia.name}가 장바구니에 추가되었습니다.")
            }

            "back" -> return
        }
    }



}

fun displayTeaMenu(cart: Cart){
    println("[ 차 메뉴 ]")
    println("1. ${BlackTea.name} | W ${BlackTea.price} | ${BlackTea.description}")
    println("2. ${GreenTea.name} | W ${GreenTea.price} | ${GreenTea.description}")
    println("3. ${OolongTea.name} | W ${OolongTea.price} | ${OolongTea.description}")
    println("메뉴 번호를 선택하세요 (예: 1 3 5), 메뉴로 돌아가려면 'back'을 입력하세요: ")

    val input = readln()
    input.split(" ").forEach { choice ->
        when (choice) {
            "1" -> {
                val blackTea = BlackTea()
                cart.addProduct(blackTea)
                println("${BlackTea.name}가 장바구니에 추가되었습니다.")
            }

            "2" -> {
                val greenTea = GreenTea()
                cart.addProduct(greenTea)
                println("${GreenTea.name}가 장바구니에 추가되었습니다.")
            }

            "3" -> {
                val oolongTea = OolongTea()
                cart.addProduct(oolongTea)
                println("${oolongTea.name}가 장바구니에 추가되었습니다.")
            }
            "back" -> return
        }
    }

}

fun cancelOrder(cart: Cart){
    println("주문을 취소중 입니다.")
    cart.clear()
    println("주문이 취소되었습니다.")

}

fun processOrder(cart: Cart){
    if (cart.getItems().isEmpty()){
        println("장바구니가 비었습니다.")
    } else{
        val order = Order(cart)
        order.confirmOrder()
        println("주문이 완료되었습니다. 메인 메뉴로 돌아가시겠습니까? (yes/no)")
        if (readlnOrNull().equals("yes", ignoreCase = true)) {
            cart.clear()
            return
        }
    }
}
