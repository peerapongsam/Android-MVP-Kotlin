package com.pantip.libraries.imagepicker.login

interface LoginInteractor {
    interface OnLoginFinishedListener {
        fun onUsernameError()
        fun onPasswordError()
        fun onSuccess()
    }

    fun login(username: String, password: String, listener: OnLoginFinishedListener)
}