package Coffee


import Product
class Espresso(
    override val name: String,
    override val description: String,
    override val price: Double) : Product