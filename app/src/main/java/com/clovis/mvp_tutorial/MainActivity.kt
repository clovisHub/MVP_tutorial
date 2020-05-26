package com.clovis.mvp_tutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.clovis.mvp_tutorial.views.FirstActivity
import com.clovis.mvp_tutorial.views.FirstActivity.Companion.startFirstActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Go to first activity
        startFirstActivity(this)
    }
}
