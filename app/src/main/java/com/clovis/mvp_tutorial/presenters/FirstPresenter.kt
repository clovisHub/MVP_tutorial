package com.clovis.mvp_tutorial.presenters

import com.clovis.mvp_tutorial.models.businessmodels.Post
import com.clovis.mvp_tutorial.models.repository.FirstRepository
import com.clovis.mvp_tutorial.views.FirstActivity
import com.clovis.mvp_tutorial.views.FirstContract

class FirstPresenter  {

    private var view : FirstActivity? = null

    fun setPresenter (views: FirstActivity) {
        view = views
        // we did not use multi threading here because we want to keep it simple.
        FirstRepository.makeRequest(views.application, this)
    }

    fun fetchData(list: List<Post>) {
        if(view != null) (view as FirstContract).display(list)
    }
}