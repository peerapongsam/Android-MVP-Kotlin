package com.pantip.libraries.imagepicker.login

class LoginPresenterImpl(var loginView: LoginView?, var interactor: LoginInteractor) : LoginPresenter, LoginInteractor.OnLoginFinishedListener {
    override fun validateCredentials(username: String, password: String) {
        loginView?.showProgress()

        interactor.login(username, password, this)
    }

    override fun onDestroy() {
        loginView = null
    }

    override fun onUsernameError() {
        loginView?.setUsernameError()
        loginView?.hideProgress()
    }

    override fun onPasswordError() {
        loginView?.setPasswordError()
        loginView?.hideProgress()
    }

    override fun onSuccess() {
        loginView?.navigateToHome()
    }
}