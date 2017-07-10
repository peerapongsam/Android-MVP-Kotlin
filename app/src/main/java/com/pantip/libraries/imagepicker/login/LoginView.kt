package com.pantip.libraries.imagepicker.login

interface LoginView {
    fun showProgress()

    fun hideProgress()

    fun setUsernameError()

    fun setPasswordError()

    fun navigateToHome()
}