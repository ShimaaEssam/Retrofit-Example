package com.example.lenovo.retrofit

class ResultModel {
    private var posts: List<Post>? = null
    fun getPosts(): List<Post>? {
        return posts
    }
    fun setPosts(posts: List<Post>) {
        this.posts = posts
    }

}
