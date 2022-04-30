package com.clovis.mvp_tutorial.views

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.clovis.mvp_tutorial.models.businessmodels.Post
import com.clovis.mvp_tutorial.presenters.FirstPresenter

class SecondActivity: AppCompatActivity(), FirstContract {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val presenter = FirstPresenter(this)
        presenter.makeCall()
    }

    override fun display(values: List<Post>) {

    }
}