package product.coffee

import menu.Coffee

class Latte : Coffee(Latte.name, Latte.description, Latte.price){
    companion object {
        const val name = "라떼"
        const val description = "라떼는 말이야..."
        const val price = 3.000
    }

    override val name: String
        get() = Companion.name
    override val description: String
        get() = Companion.description
    override val price: Double
        get() = Companion.price
}