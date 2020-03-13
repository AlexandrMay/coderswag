package com.may.coderswag.services

import com.may.coderswag.model.Category
import com.may.coderswag.model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes graphic beanie", "$18", "hat01"),
        Product("Devslopes hat black", "$20", "hat02"),
        Product("Devslopes hat white", "$1", "hat03"),
        Product("Devslopes bad hat", "$185", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes hoodie gray", "$50", "hoodie01"),
        Product("Devslopes hoodie red", "$32", "hoodie02"),
        Product("Devslopes hoodie yellow", "$55", "hoodie03"),
        Product("Devslopes hoodie black", "$5", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes shirt gray", "$44", "shirt01"),
        Product("Devslopes shirt red", "$34", "shirt02"),
        Product("Devslopes shirt yellow", "$24", "shirt03"),
        Product("Devslopes shirt black", "$53", "shirt04"),
        Product("Devslopes shirt pink", "$39", "shirt05")
    )

}