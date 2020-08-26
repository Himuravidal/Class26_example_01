package com.crisspian.class26_example_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.crisspian.class26_example_01.network.ClientRetrofit
import com.crisspian.class26_example_01.pojo.Post
import retrofit2.Callback
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    private fun loadApiData() {
        val service = ClientRetrofit.retrofitInstance()
        val call = service.groupList()


    }
}