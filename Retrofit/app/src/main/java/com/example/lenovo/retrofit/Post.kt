package com.example.lenovo.retrofit

class Post {
     private lateinit var id: String
    private lateinit var post_content:String
    private lateinit var post_writer:String
    private lateinit var created_at:String
    fun getId(): String {
        return id
    }

    fun setId(id: String) {
        this.id = id
    }

    fun getPost_content(): String {
        return post_content
    }

    fun setPost_content(post_content: String) {
        this.post_content = post_content
    }

    fun getPost_writer(): String {
        return post_writer
    }

    fun setPost_writer(post_writer: String) {
        this.post_writer = post_writer
    }

    fun getCreated_at(): String {
        return created_at
    }

    fun setCreated_at(created_at: String) {
        this.created_at = created_at
    }


}
