package com.peerapongsam.lab.androidmvpkotlin.main

class MainPresenterImpl(private var mainView: MainView?, private var interactor: FindItemsInteractor) : MainPresenter, FindItemsInteractor.OnFinishedListener {
    override fun onResume() {
        if (mainView != null)
            mainView?.showProgress()

        interactor.findItems(this)
    }

    override fun onItemClicked(position: Int) {
        if (mainView != null)
            mainView?.showMessage(String.format("Position %d clicked", position + 1))
    }

    override fun onDestroy() {
        mainView = null
    }

    override fun onFinished(items: List<String>) {
        if (mainView != null) {
            mainView?.setItems(items)
            mainView?.hideProgress()
        }
    }
}
