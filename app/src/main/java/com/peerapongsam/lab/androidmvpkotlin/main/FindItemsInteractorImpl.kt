package com.peerapongsam.lab.androidmvpkotlin.main

import android.os.Handler

class FindItemsInteractorImpl : FindItemsInteractor {
    override fun findItems(listener: FindItemsInteractor.OnFinishedListener) {
        Handler().postDelayed(Runnable {
            listener.onFinished(createArrayList())
        }, 2000)
    }

    private fun createArrayList(): List<String> {
        return listOf("Item 1",
                "Item 2",
                "Item 3",
                "Item 4",
                "Item 5",
                "Item 6",
                "Item 7",
                "Item 8",
                "Item 9",
                "Item 10"
        )
    }
}