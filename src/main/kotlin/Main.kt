import product.bread.Baguette
import product.bread.Croissant
import product.bread.Focaccia
import product.coffee.*
import product.tea.BlackTea
import product.tea.GreenTea
import product.tea.OolongTea


fun main() {
    val cart = Cart()
    var running = true

    while (running) {
        displayMainMenu()

        println("번호를 입력해 주세요")
        when (readln()) {
            "0" -> {
                SalesData.displayTotalSales()
                SalesData.displaySoldProducts()
                println("아무 키나 입력하면 메인 화면으로 돌아갑니다.")

                readln()
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
    var coffeeMenuRunning = true

    while (coffeeMenuRunning) {
        println("[ 커피메뉴 ]")
        println("1. ${Americano.name} | W ${Americano.price} | ${Americano.description}")
        println("2. ${DecafAmericano.name} | W ${DecafAmericano.price} | ${DecafAmericano.description}")
        println("3. ${Espresso.name} | W ${Americano.price} | ${Americano.description}")
        println("4. ${IcedAmericano.name} | W ${IcedAmericano.price} | ${IcedAmericano.description}")
        println("5. ${Latte.name} | W ${Latte.price} | ${Latte.description}")
        println("메뉴 번호를 선택하세요, 메뉴로 돌아가려면 'back' 을 입력하세요: ")

        when (readln()) {
            "1" -> {
                val americano = Americano()

                println("샷추가를 하시겠어요? 가격은 500원입니다. (yes/no)")
                val doubleShotInput = readln()
                if (doubleShotInput.equals("yes", ignoreCase = true)) {
                    val americanoDoubleShot = Americano(doubleShot = true)
                    cart.addProduct(americanoDoubleShot)
                    println("${Americano.name} (샷추가) 가 장바구니에 추가되었습니다.")
                }else{
                    cart.addProduct(americano)
                    println("${Americano.name}가 장바구니에 추가되었습니다.")
                }
            }

            "2" -> {
                val decafAmericano = DecafAmericano()
                cart.addProduct(decafAmericano)
                println("${DecafAmericano.name}가 장바구니에 추가되었습니다.")
            }

            "3" -> {
                val espresso = Espresso()

                println("샷추가를 하시겠어요? 가격은 500원입니다. (yes/no)")
                val doubleShotInput = readln()
                if (doubleShotInput.equals("yes", ignoreCase = true)) {
                    val espressoDoubleShot = Espresso(doubleShot = true)
                    cart.addProduct(espressoDoubleShot)
                    println("${Espresso.name} (샷추가) 가 장바구니에 추가되었습니다.")
                }else{
                    cart.addProduct(espresso)
                    println("${Espresso.name}가 장바구니에 추가되었습니다.")
                }
            }

            "4" -> {
                val icedAmericano = IcedAmericano()

                println("샷추가를 하시겠어요? 가격은 500원입니다. (yes/no)")
                val doubleShotInput = readln()
                if (doubleShotInput.equals("yes", ignoreCase = true)) {
                    val icedAmericanoDoubleShot = IcedAmericano(doubleShot = true)
                    cart.addProduct(icedAmericanoDoubleShot)
                    println("${IcedAmericano.name} (샷추가) 가 장바구니에 추가되었습니다.")
                }else if(doubleShotInput.equals("no", ignoreCase = true)){
                    cart.addProduct(icedAmericano)
                    println("${IcedAmericano.name}가 장바구니에 추가되었습니다.")
                }else{
                    println("올바르게 입력해 주세요.")
                    continue
                }
            }

            "5" -> {
                val latte = Latte()
                cart.addProduct(latte)
                println("${Latte.name}가 장바구니에 추가되었습니다.")
            }

            "back" -> {
                coffeeMenuRunning = false
            }

            else -> println("잘 못 입력하셨습니다. 다시 골라주세요")
        }
    }
}


fun displayBreadMenu(cart: Cart) {
    var breadMenuRunning = true

    while (breadMenuRunning) {
        println("[ 빵 메뉴 ]")
        println("1. ${Baguette.name} | W ${Baguette.price} | ${Baguette.description}")
        println("2. ${Croissant.name} | W ${Croissant.price} | ${Croissant.description}")
        println("3. ${Focaccia.name} | W ${Focaccia.price} | ${Focaccia.description}")
        println("메뉴 번호를 선택하세요 (예: 1 3 5), 메뉴로 돌아가려면 'back' 을 입력하세요: ")

        when (readln()) {
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

            "back" -> {
                breadMenuRunning = false
            }

            else -> println("잘 못 입력하셨습니다. 다시 골라주세요")
        }
    }
}


fun displayTeaMenu(cart: Cart) {
    var teaMenuRunning = true

    while (teaMenuRunning) {
        println("[ 차 메뉴 ]")
        println("1. ${BlackTea.name} | W ${BlackTea.price} | ${BlackTea.description}")
        println("2. ${GreenTea.name} | W ${GreenTea.price} | ${GreenTea.description}")
        println("3. ${OolongTea.name} | W ${OolongTea.price} | ${OolongTea.description}")
        println("메뉴 번호를 선택하세요 (예: 1 3 5), 메뉴로 돌아가려면 'back' 을 입력하세요: ")

        when (readln()) {
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

            "back" -> {
                teaMenuRunning = false
            }

            else -> println("잘 못 입력하셨습니다. 다시 골라주세요")
        }
    }
}


fun cancelOrder(cart: Cart) {
    println("주문을 취소중 입니다.")
    cart.clear()
    println("주문이 취소되었습니다.  3초후에 메인 메뉴로 돌아갑니다")
    Thread.sleep(3000)

}

fun processOrder(cart: Cart) {
    if (cart.getItems().isEmpty()) {
        println("장바구니가 비었습니다. 3초후에 메인 메뉴로 돌아갑니다")

        Thread.sleep(3000)
    } else {
        val order = Order(cart)

        order.confirmOrder()

        Thread.sleep(3000)

    }
}
