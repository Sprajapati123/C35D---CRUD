package com.example.c35d_crud.repository

import android.widget.Toast
import com.example.c35d_crud.model.UserModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class UserRespositoryImpl : UserRepository {

    var auth : FirebaseAuth = FirebaseAuth.getInstance()

    var database: FirebaseDatabase = FirebaseDatabase.getInstance()
    var reference = database.reference.child("users")


    override fun login(email: String, password: String, callback: (Boolean, String) -> Unit) {

        auth.signInWithEmailAndPassword(email,password).addOnCompleteListener {
            if(it.isSuccessful){
                callback(true,"Login success")
            }else{
                callback(false,it.exception?.message.toString())
            }
        }
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
        auth.sendPasswordResetEmail(email).addOnCompleteListener {
            if(it.isSuccessful){
                callback(true,"Password reset link sent to $email")
            }else{
                callback(false,it.exception?.message.toString())
            }
        }
    }

    override fun addUserToDatabase(
        userId: String,
        userModel: UserModel,
        callback: (Boolean, String) -> Unit
    ) {
        reference.child(userId).setValue(userModel)
            .addOnCompleteListener {
                if(it.isSuccessful){
                    callback(true,"Registration Successfull")
                }else{
                    callback(false,it.exception?.message.toString())
                }
            }
    }
}