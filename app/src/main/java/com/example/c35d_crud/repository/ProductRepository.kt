package com.example.c35d_crud.repository

import com.example.c35d_crud.model.ProductModel
import com.example.c35d_crud.model.UserModel

interface ProductRepository {
//    {
//     "success":true
//     "message":"Product fetched successfully"
//    }

    fun addProduct(
        productModel: ProductModel,
        callback: (Boolean, String) -> Unit
    )

    fun updateProduct(
        productId: String,
        data: MutableMap<String, Any>,
        callback: (Boolean, String) -> Unit
    )

    fun deleteProduct(
        productId: String,
        callback: (Boolean, String) -> Unit
    )

    fun getProductById(
        productId: String,
        callback: (ProductModel?, Boolean, String)
        -> Unit
    )

    fun getAllProducts(
        callback:
            (List<ProductModel>?, Boolean, String) -> Unit
    )
}