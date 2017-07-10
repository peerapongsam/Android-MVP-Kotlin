package com.pantip.libraries.imagepicker.login

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.pantip.libraries.imagepicker.R
import com.pantip.libraries.imagepicker.main.MainActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginView {

    lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        presenter = LoginPresenterImpl(this, LoginInteractorImpl())


        button.setOnClickListener {
            presenter.validateCredentials(username.text.toString(), password.text.toString())
        }
    }

    override fun showProgress() {
        progress.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        progress.visibility = View.INVISIBLE
    }

    override fun setUsernameError() {
        username.error = getString(R.string.username_error)
    }

    override fun setPasswordError() {
        password.error = getString(R.string.password_error)
    }

    override fun navigateToHome() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}