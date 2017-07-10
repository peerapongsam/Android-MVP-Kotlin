package com.pantip.libraries.imagepicker.main

interface FindItemsInteractor {
    interface OnFinishedListener {
        fun onFinished(items: List<String>)
    }

    fun findItems(listener: OnFinishedListener)
}