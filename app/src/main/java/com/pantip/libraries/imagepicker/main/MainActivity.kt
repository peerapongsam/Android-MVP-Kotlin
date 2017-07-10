package com.pantip.libraries.imagepicker.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.pantip.libraries.imagepicker.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView, AdapterView.OnItemClickListener {
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.onItemClickListener = this

        presenter = MainPresenterImpl(this, FindItemsInteractorImpl())
    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }

    override fun showProgress() {
        progress.visibility = View.VISIBLE
        list.visibility = View.INVISIBLE
    }

    override fun hideProgress() {
        progress.visibility = View.INVISIBLE
        list.visibility = View.VISIBLE
    }

    override fun setItems(items: List<String>) {
        list.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
    }

    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        presenter.onItemClicked(position)
    }
}
