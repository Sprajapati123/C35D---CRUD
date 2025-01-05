package com.example.c35d_crud.repository

import com.example.c35d_crud.model.UserModel

interface UserRepository {
//    {
//    success: true
//    message: Login success
//    userId : 2000110
//    }

    fun login(email: String, password: String, callback: (Boolean, String) -> Unit)

    fun register(
        email: String, password: String,
        callback: (Boolean, String, String) -> Unit
    )

    fun forgetPassword(email: String, callback: (Boolean, String) -> Unit)

    fun addUserToDatabase(
        userId: String, userModel: UserModel,
        callback: (Boolean, String) -> Unit
    )
}