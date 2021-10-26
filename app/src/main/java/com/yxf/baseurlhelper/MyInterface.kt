package com.yxf.baseurlhelper

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

/**
 *   author:yxf
 *   time:2021/10/26
 */
interface MyInterface {
    @GET("api/get_data")
    fun getData() : Call<ResponseBody>
}