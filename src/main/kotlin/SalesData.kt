object SalesData {
    private var totalSales: Double = 0.0
    private val soldProducts = mutableListOf<Product>()

    fun addSale(products: List<Product>) {
        products.forEach { product ->
            if (!soldProducts.contains(product)) {
                soldProducts.add(product)
                totalSales += product.price
            }
        }
    }

    fun displayTotalSales() {
        println("총 판매 금액 : ₩$totalSales")
    }

    fun displaySoldProducts() {
        soldProducts.groupBy { it.name }.forEach { (name, products) ->
            val length = products.size
            println("$name | 판매량 : $length")
        }
    }
}