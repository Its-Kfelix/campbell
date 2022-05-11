package com.example.campbell.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.campbell.R
import com.example.campbell.Utils.toast
import com.example.campbell.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), AuthListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding:ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)
        binding.viewmodel=viewModel
        viewModel.authListener = this
    }

    override fun onStarted() {
        toast("Login started")
    }

    override fun onSuccess() {
        toast("login success")
    }

    override fun onFailure(message: String) {
        toast(message)
    }

}