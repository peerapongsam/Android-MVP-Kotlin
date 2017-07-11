package com.peerapongsam.lab.androidmvpkotlin.login

import android.os.Handler
import android.text.TextUtils

/**
 * Created by peerapong on 7/11/17.
 */

class LoginImpl : LoginInteractor {
    override fun login(username: String, password: String, listener: LoginInteractor.OnLoginFinishedListener) {
        Handler().postDelayed(Runnable {
            var error = false
            if (TextUtils.isEmpty(username)) {
                listener.onUsernameError()
                error = true
                return@Runnable
            }

            if (TextUtils.isEmpty(password)) {
                listener.onPasswordError()
                error = true
                return@Runnable
            }

            if (!error) {
                listener.onSuccess()
            }
        }, 2000)
    }
}
