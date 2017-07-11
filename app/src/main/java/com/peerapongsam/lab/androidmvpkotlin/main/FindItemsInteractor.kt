package com.peerapongsam.lab.androidmvpkotlin.main

interface FindItemsInteractor {
    interface OnFinishedListener {
        fun onFinished(items: List<String>)
    }

    fun findItems(listener: OnFinishedListener)
}