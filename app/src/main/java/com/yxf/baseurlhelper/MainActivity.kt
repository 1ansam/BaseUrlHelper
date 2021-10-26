package com.yxf.baseurlhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        使用
        val service = RetrofitService.create(MyInterface::class.java)
//        改变
        BaseUrlHelper.instance.setUrlField("http://192.168.2.2:8099")
        val call = service.getData()
        call.enqueue(object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })


    }
}