package product.tea

import menu.Tea



class BlackTea : Tea(BlackTea.name, BlackTea.description, BlackTea.price) {
    companion object {
        const val name = "홍차"
        const val description = "홍차에요"
        const val price = 2.500
    }

    override val name: String
        get() = Companion.name
    override val description: String
        get() = Companion.description
    override val price: Double
        get() = Companion.price
}