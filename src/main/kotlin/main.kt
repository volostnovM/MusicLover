fun main() {
    val amount = 100000.0
    var total = 0.0
    val isRegular = true

    if (amount <= 1000) {
        total = if (isRegular) amount * 0.99 else amount
    } else if (amount > 1000 && amount <= 10_000) {
        total = amount - 100
        total = if (isRegular) total * 0.99 else total
    } else if (amount > 10000) {
        total = amount * 0.95
        total = if (isRegular) total * 0.99 else total
    }

    println("Ваша покупка без скидки: $amount. Покупка со скидкой: $total. Ваша выгода: ${amount - total}")
}