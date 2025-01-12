package com.example.c35d_crud.repository

import com.example.c35d_crud.model.ProductModel

class ProductRepositoryImpl : ProductRepository  {

    override fun addProduct(
        productId: String,
        productModel: ProductModel,
        callback: (Boolean, String) -> Unit
    ) {
        TODO("Not yet implemented")
    }

    override fun getAllProduct() {
        TODO("Not yet implemented")
    }

    override fun getProductBYID() {
        TODO("Not yet implemented")
    }

    override fun deleteProduct() {
        TODO("Not yet implemented")
    }

    override fun updateProduct() {
        TODO("Not yet implemented")
    }
}