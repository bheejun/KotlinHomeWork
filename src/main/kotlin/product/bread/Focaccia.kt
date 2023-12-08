package product.bread

import menu.Bread

class Focaccia : Bread(name, description, price) {
    companion object {
        const val name = "포카차"
        const val description = "올리브와 허브를 곁들여 향긋해요"
        const val price = 2.5
    }

    override val name: String
        get() = Companion.name
    override val description: String
        get() = Companion.description
    override val price: Double
        get() = Companion.price
}