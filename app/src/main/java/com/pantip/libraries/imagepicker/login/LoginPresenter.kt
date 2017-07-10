package com.pantip.libraries.imagepicker.login

interface LoginPresenter {
    fun validateCredentials(username: String, password: String)

    fun onDestroy()
}