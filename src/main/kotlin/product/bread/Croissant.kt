package product.bread

import menu.Bread

class Croissant : Bread(name, description, price) {
    companion object {
        const val name = "크루아상"
        const val description = "버터의 풍미가 가득해요"
        const val price = 3.000
    }

    override val name: String
        get() = Companion.name
    override val description: String
        get() = Companion.description
    override val price: Double
        get() = Companion.price
}