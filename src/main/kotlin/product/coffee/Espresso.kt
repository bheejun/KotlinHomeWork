package product.coffee


import menu.Coffee

class Espresso(doubleShot: Boolean = false) : Coffee(name, description, price) {
    companion object {
        const val name = "에스프레소"
        const val description = "진하고 향이 좋은 에스프레소"
        const val price = 2.000
    }

    override val name: String
        get() = Companion.name
    override val description: String
        get() = Companion.description
    override val price: Double
        get() = Americano.price + if (doubleShot) 0.5 else 0.0
}