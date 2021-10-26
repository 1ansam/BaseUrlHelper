package com.yxf.baseurlhelper

import retrofit2.Retrofit

/**
 *   author:yxf
 *   time:2021/10/26
 */
object RetrofitService {
    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl(
            BaseUrlHelper.instance.httpUrl).build()
    }


    fun <T> create (clazz: Class<T>): T {
        return getRetrofit().create(clazz)
    }
}