package com.example.lenovo.retrofit



import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface API {
        @GET("getposts.php")
        fun getposts(): Call<ResultModel>

    @FormUrlEncoded
    @POST("insertuserwithpost.php")
    fun adduser(@Field("username") username:String ,@Field("password") password:String,
                @Field("email") email:String ,@Field("address") address:String): Call<ResponseBody>


    }
