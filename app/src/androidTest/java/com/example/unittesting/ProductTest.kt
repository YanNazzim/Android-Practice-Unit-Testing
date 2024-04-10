package com.example.unittesting

import com.example.unittestingPractice.Product
import org.junit.Test
import junit.framework.TestCase.assertEquals

class ProductTest {

    @Test
    fun spaghetti() {
        // Arrange
        val product = Product("Spaghetti", 20.00, 3)
        val discountPercent = 20

        // Act
        product.applyDiscount(discountPercent)

        // Assert
        assertEquals(16.00, product.price) // Expected price after discount
    }

    @Test
    fun steak() {
        // Arrange
        val product = Product("Steak", 30.00, 8)
        val discountPercent = 20 // Discount should not be applied

        // Act
        product.applyDiscount(discountPercent)

        // Assert
        assertEquals(30.00, product.price) // Price should remain unchanged
    }

    @Test
    fun lasagna() {
        // Arrange
        val product = Product("Lasagna", 10.00, 0)
        val discountPercent = 20

        // Act
        product.applyDiscount(discountPercent)

        // Assert
        assertEquals(10.00, product.price) // Price should remain unchanged
    }
}
