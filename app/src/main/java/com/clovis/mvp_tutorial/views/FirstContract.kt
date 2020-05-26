package com.clovis.mvp_tutorial.views

import com.clovis.mvp_tutorial.models.businessmodels.Post

interface FirstContract {

    fun display(values: List<Post>)
}