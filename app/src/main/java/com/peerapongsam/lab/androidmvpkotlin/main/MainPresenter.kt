package com.peerapongsam.lab.androidmvpkotlin.main

interface MainPresenter {

    fun onResume()

    fun onItemClicked(position: Int)

    fun onDestroy()
}
