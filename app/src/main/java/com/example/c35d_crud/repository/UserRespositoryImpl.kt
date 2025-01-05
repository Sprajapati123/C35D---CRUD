package com.example.c35d_crud.repository

import com.example.c35d_crud.model.UserModel
import com.google.firebase.auth.FirebaseAuth

class UserRespositoryImpl : UserRepository {

    var auth : FirebaseAuth = FirebaseAuth.getInstance()

    override fun login(email: String, password: String, callback: (Boolean, String) -> Unit) {
        TODO("Not yet implemented")
    }

    override fun register(
        email: String,
        password: String,
        callback: (Boolean, String, String) -> Unit
    ) {
        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
            if(it.isSuccessful){
                callback(true,"Registration success",
                    auth.currentUser?.uid.toString())
            }else{
                callback(false,it.exception?.message.toString(),"")
            }
        }
    }

    override fun forgetPassword(email: String, callback: (Boolean, String) -> Unit) {
        TODO("Not yet implemented")
    }

    override fun addUserToDatabase(
        userId: String,
        userModel: UserModel,
        callback: (Boolean, String) -> Unit
    ) {
        TODO("Not yet implemented")
    }
}