package Bread


class Baguette(
    override val name: String = "바게뜨",
    override val description: String = "전통적인 프랑스 빵",
    override val price: Double = 2.5) : Bread(name, description, price)