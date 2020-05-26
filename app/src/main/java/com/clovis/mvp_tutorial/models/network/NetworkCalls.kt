package com.clovis.mvp_tutorial.models.network

import android.content.Context
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.clovis.mvp_tutorial.models.repository.FirstRepository


object MyVolley {

    /**
     * This method makes a network call using Volley library with a GET method.
     */
    fun makeRequest(context: Context, firstRepo: FirstRepository) {

        val queue = Volley.newRequestQueue(context)

        val stringRequest = StringRequest(
            Request.Method.GET,
            "https://jsonplaceholder.typicode.com/posts",
            Response.Listener<String> { response ->

                if(firstRepo != null) {
                    // the line below send this response to the repository
                    firstRepo.fetchData(response)
                }
            },
            Response.ErrorListener {
                Log.e("error", it.message)
            })

        // Add the request to the RequestQueue.
        queue.add(stringRequest)
    }
}