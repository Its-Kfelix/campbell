package com.example.campbell.ui.auth

import android.provider.LiveFolders
import androidx.lifecycle.LiveData

interface AuthListener {
    fun onStarted()
    fun onSuccess(loginResponse:LiveData<String>)
    fun onFailure(message:String)

}