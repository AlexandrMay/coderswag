package com.may.coderswag.services

import com.may.coderswag.model.Category
import com.may.coderswag.model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes graphic beanie", "$18", "hat1"),
        Product("Devslopes hat black", "$20", "hat2"),
        Product("Devslopes hat white", "$1", "hat3"),
        Product("Devslopes bad hat", "$185", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes hoodie gray", "$50", "hoodie1"),
        Product("Devslopes hoodie red", "$32", "hoodie2"),
        Product("Devslopes hoodie yellow", "$55", "hoodie3"),
        Product("Devslopes hoodie black", "$5", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes shirt gray", "$44", "shirt1"),
        Product("Devslopes shirt red", "$34", "shirt2"),
        Product("Devslopes shirt yellow", "$24", "shirt3"),
        Product("Devslopes shirt black", "$53", "shirt4"),
        Product("Devslopes shirt pink", "$39", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String) : List<Product> {
        return when (category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }

}