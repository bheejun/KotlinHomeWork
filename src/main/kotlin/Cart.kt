class Cart {
    private val items = mutableListOf<Product>()

    fun addProduct(product: Product) {
        items.add(product)
    }

    fun getTotalPrice(): Double {
        return items.sumOf { it.price }
    }

    fun getItems(): List<Product> {
        return items.toList()
    }

    fun clear() {
        items.clear()
    }
}