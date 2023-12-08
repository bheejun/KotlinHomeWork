package product.tea

import menu.Tea

class GreenTea : Tea(name, description, price) {
    companion object {
        const val name = "녹차"
        const val description = "보성산 녹차"
        const val price = 2.500
    }

    override val name: String
        get() = Companion.name
    override val description: String
        get() = Companion.description
    override val price: Double
        get() = Companion.price
}