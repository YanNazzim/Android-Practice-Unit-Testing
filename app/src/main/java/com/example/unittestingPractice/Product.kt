package com.example.unittestingPractice

data class Product(
    val title: String,
    var price: Double,
    var amount: Int
) {

    fun applyDiscount(discountPercent: Int) {
        if (amount in 1..10) {
            price -= (price * discountPercent / 100)
        }
    }

}