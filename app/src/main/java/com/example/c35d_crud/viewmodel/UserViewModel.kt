package com.example.c35d_crud.viewmodel

import com.example.c35d_crud.model.UserModel
import com.example.c35d_crud.repository.UserRepository

class UserViewModel(val repo : UserRepository) {

    fun login(email: String, password: String, callback: (Boolean, String) -> Unit){
        repo.login(email,password,callback)
    }

    fun register(
        email: String, password: String,
        callback: (Boolean, String, String) -> Unit
    ){
        repo.register(email, password, callback)
    }

    fun forgetPassword(email: String, callback: (Boolean, String) -> Unit){
        repo.forgetPassword(email, callback)
    }

    fun addUserToDatabase(
        userId: String, userModel: UserModel,
        callback: (Boolean, String) -> Unit
    ){
        repo.addUserToDatabase(userId, userModel, callback)
    }

}