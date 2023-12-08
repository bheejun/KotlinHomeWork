package product.coffee

import menu.Coffee

class DecafAmericano : Coffee(DecafAmericano.name, DecafAmericano.description, DecafAmericano.price) {
    companion object {
        const val name = "디카페인 아메리카노"
        const val description = "카페인이 없어요"
        const val price = 3.000
    }

    override val name: String
    get() = Companion.name
    override val description: String
    get() = Companion.description
    override val price: Double
    get() = Companion.price
}