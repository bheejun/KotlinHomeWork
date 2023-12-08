package product.coffee

import menu.Coffee

class IcedAmericano(doubleShot: Boolean = false) : Coffee(name, description, price) {
    companion object {
        const val name = "아이스 아메리카노"
        const val description = "얼죽아"
        const val price = 2.700
    }

    override val name: String
        get() = Companion.name
    override val description: String
        get() = Companion.description
    override val price: Double
        get() = Americano.price + if (doubleShot) 0.5 else 0.0
}