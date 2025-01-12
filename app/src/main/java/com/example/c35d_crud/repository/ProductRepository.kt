package com.example.c35d_crud.repository

import com.example.c35d_crud.model.ProductModel

interface ProductRepository {

    fun addProduct(productId:String,
                   productModel: ProductModel,callback:(Boolean,String) ->Unit)
    fun getAllProduct()
    fun getProductBYID()
    fun deleteProduct()
    fun updateProduct()
}