package com.clovis.mvp_tutorial.views

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.clovis.mvp_tutorial.R
import com.clovis.mvp_tutorial.models.businessmodels.Post
import com.clovis.mvp_tutorial.presenters.FirstPresenter
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity(), FirstContract {
    private val postListAdapter :PostsAdapter by lazy { PostsAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        initView()

        val presenter = FirstPresenter(this)
        presenter.makeCall()

    }

    private fun initView() {
        val layoutManager = LinearLayoutManager(this)
        recyclerId.layoutManager = layoutManager
        recyclerId.adapter = postListAdapter
        recyclerId.setHasFixedSize(true)
    }

    override fun display(posts: List<Post>) {
        postListAdapter.setPostList(posts)
    }


    companion object {
        fun startFirstActivity(context: AppCompatActivity) {
            context.startActivity(Intent(context, FirstActivity::class.java))
        }
    }
}