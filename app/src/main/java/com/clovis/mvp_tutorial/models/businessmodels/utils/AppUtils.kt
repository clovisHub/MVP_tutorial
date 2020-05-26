package com.clovis.mvp_tutorial.models.businessmodels.utils

import com.clovis.mvp_tutorial.models.businessmodels.Post
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

object AppUtils {

    fun getGsonBuilder() : Gson {
        return GsonBuilder().create()
    }
}