package com.clovis.mvp_tutorial.presenters

import android.app.Application
import com.clovis.mvp_tutorial.models.businessmodels.Post
import com.clovis.mvp_tutorial.models.repository.FirstRepository
import com.clovis.mvp_tutorial.views.FirstActivity
import com.clovis.mvp_tutorial.views.FirstContract

class FirstPresenter (private var view: FirstContract) {

    fun makeCall() {
        // we did not use multi threading here because we want to keep it simple.
        FirstRepository.makeRequest(Application(), this)
    }

    fun fetchData(list: List<Post>) {
        view.display(list)
    }
}