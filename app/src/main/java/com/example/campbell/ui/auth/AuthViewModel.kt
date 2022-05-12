package com.example.campbell.ui.auth

import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.campbell.data.repository.UserRepository

class AuthViewModel:ViewModel() {
    var email:String? =null
    var password:String? = null
    var authListener:AuthListener? =null
    fun onLoginButtonClicked(view:View){
//        authListener?.onStarted()
        if (email.isNullOrEmpty()|| password.isNullOrEmpty()){
            //validate
                authListener?.onFailure("Invalid Email or Password")

            return
        }
        //success
        val loginResponse =UserRepository().userLogin(email!!,password!!)
        authListener?.onSuccess(loginResponse)
    }

}