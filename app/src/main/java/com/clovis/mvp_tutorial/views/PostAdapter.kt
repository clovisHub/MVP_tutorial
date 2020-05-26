package com.clovis.mvp_tutorial.views

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.clovis.mvp_tutorial.R
import com.clovis.mvp_tutorial.databinding.PostItemBinding
import com.clovis.mvp_tutorial.models.businessmodels.Post

class PostsAdapter : RecyclerView.Adapter<PostsAdapter.PostHolder>() {

    private var postsList:List<Post> = mutableListOf()

    fun setPostList(posts: List<Post>) {
        postsList = posts
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): PostHolder {
        val view  = DataBindingUtil
            .inflate<PostItemBinding>(LayoutInflater.from(parent.context),
                R.layout.post_item, parent, false)

        return PostHolder(view)
    }

    override fun onBindViewHolder(postHolder: PostHolder, position: Int) {
        val post = postsList[position]
        postHolder.view.post = post
    }

    override fun getItemCount(): Int {
        return postsList.size
    }

    class PostHolder(val view: PostItemBinding) : RecyclerView.ViewHolder(view.root)
}