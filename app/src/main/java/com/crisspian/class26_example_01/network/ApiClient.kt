package com.crisspian.class26_example_01.network


import com.crisspian.class26_example_01.pojo.Post
import retrofit2.Call
import retrofit2.http.GET

interface ApiClient {

    @GET("posts/")
    fun groupList(): Call<List<Post>>


}