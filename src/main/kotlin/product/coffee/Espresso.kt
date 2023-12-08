package product.coffee


import menu.Coffee

class Espresso : Coffee(Espresso.name, Espresso.description, Espresso.price) {
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
        get() = Companion.price
}