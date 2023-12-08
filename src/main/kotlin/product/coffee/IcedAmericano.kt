package product.coffee

import menu.Coffee

class IcedAmericano : Coffee(IcedAmericano.name, IcedAmericano.description, IcedAmericano.price) {
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
        get() = Companion.price
}