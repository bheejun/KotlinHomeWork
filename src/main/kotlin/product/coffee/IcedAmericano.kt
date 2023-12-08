package product.coffee

import menu.Coffee

class IcedAmericano(doubleShot: Boolean = false) : Coffee(Espresso.name, Espresso.description, Espresso.price + if (doubleShot) 0.5 else 0.0, doubleShot)  {
    companion object {
        const val name = "아이스 아메리카노"
        const val description = "얼죽아"
        const val price = 2.700
    }
}