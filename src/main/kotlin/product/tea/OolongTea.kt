package product.tea

import menu.Tea

class OolongTea : Tea(OolongTea.name, OolongTea.description, OolongTea.price) {
    companion object {
        const val name = "우롱차"
        const val description = "우롱차에요"
        const val price = 2.500
    }

    override val name: String
        get() = Companion.name
    override val description: String
        get() = Companion.description
    override val price: Double
        get() = Companion.price
}