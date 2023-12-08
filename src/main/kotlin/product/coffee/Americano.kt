package product.coffee

import menu.Coffee

class Americano(doubleShot: Boolean = false) : Coffee(name, description, price) {
    companion object {
        const val name = "아메리카노"
        const val description = "과테말라 산 원두를 사용했어요"
        const val price = 2.500
        const val doubleShot = false
    }

    override val name: String
        get() = Companion.name
    override val description: String
        get() = Companion.description
    override val price: Double
        get() = Companion.price + if (doubleShot) 0.5 else 0.0

}