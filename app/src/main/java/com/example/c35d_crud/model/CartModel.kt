package com.example.c35d_crud.model

data class CartModel(
    var cartId : String = "",
    var userId : String = "",
    var productId : String = "",
    var quantity : Int
) {
}