package com.pantip.libraries.imagepicker.main

interface MainPresenter {

    fun onResume()

    fun onItemClicked(position: Int)

    fun onDestroy()
}
