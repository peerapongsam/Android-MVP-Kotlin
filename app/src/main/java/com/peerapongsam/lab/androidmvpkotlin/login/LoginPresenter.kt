package com.peerapongsam.lab.androidmvpkotlin.login

interface LoginPresenter {
    fun validateCredentials(username: String, password: String)

    fun onDestroy()
}