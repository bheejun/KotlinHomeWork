package product.bread

import menu.Bread

class Baguette : Bread(Baguette.name, Baguette.description, Baguette.price){
    companion object {
        const val name = "바게뜨"
        const val description = "바삭한 프랑스 전통 빵"
        const val price = 2.500
    }
}