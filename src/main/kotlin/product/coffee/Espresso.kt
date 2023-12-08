package product.coffee


import menu.Coffee

class Espresso(doubleShot: Boolean = false) : Coffee(Companion.name, Companion.description, Companion.price + if (doubleShot) 0.5 else 0.0, doubleShot) {
    companion object {
        const val name = "에스프레소"
        const val description = "진하고 향이 좋은 에스프레소"
        const val price = 2.0
    }
}