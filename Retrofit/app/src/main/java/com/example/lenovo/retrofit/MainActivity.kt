package com.example.lenovo.retrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import java.io.IOException

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text:TextView =findViewById(R.id.textview1);
        var get:TextView =findViewById(R.id.textview2);
        val retrofit = Retrofit.Builder()
                .addConverterFactory(
                        GsonConverterFactory.create())
                .baseUrl("http://developerhendy.16mb.com/")
                .build()

        var api = retrofit.create(API::class.java)
        var adduserConn = api.adduser("Amer","324","a@gmail.com","Cairo")
        adduserConn.enqueue(object : Callback<ResponseBody> {
            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {
                //
            }

            override fun onResponse(call: Call<ResponseBody>?, response: Response<ResponseBody>?) {
                try{
                    text.text = response!!.body().string()

                }
                catch (e:IOException){
                    e.printStackTrace()

                }
            }


        })


        var connection = api.getposts()
        connection.enqueue(object : Callback<ResultModel> {
            override fun onFailure(call: Call<ResultModel>?, t: Throwable?) {
                //
            }

            override fun onResponse(call: Call<ResultModel>?, response: Response<ResultModel>?) {
                var posts = response!!.body().getPosts()
                if (posts != null) {
                    for (i in 0..posts.size) {
                        var postContent: String =posts.get(i).getPost_content()
                        get.append(postContent+"\n")
                    }
                }
            }
        })
    }
}
