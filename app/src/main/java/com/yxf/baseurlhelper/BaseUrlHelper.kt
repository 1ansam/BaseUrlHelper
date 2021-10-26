package com.yxf.baseurlhelper

import okhttp3.HttpUrl
import java.lang.reflect.Field

/**
 *   author:yxf
 *   time:2021/10/26
 */
class BaseUrlHelper( val httpUrl: HttpUrl) {
    companion object {
        private var schemeField: Field = HttpUrl::class.java.getDeclaredField("scheme")

        private var hostField: Field = HttpUrl::class.java.getDeclaredField("host")

        private var portField: Field = HttpUrl::class.java.getDeclaredField("port")

        private var urlField: Field = HttpUrl::class.java.getDeclaredField("url")
        val instance: BaseUrlHelper
            get() = Instance.instance

    }

    fun setHostField(host: String) {
        try {
            hostField.isAccessible = true
            hostField.set(httpUrl, host)
        } catch (e: IllegalAccessException) {
            e.printStackTrace()
        }


    }

    fun setUrlField(url: String) {
        try {
            urlField.isAccessible = true
            urlField.set(httpUrl, url)
        } catch (e: IllegalAccessException) {
            e.printStackTrace()
        }
    }

    fun setSchemeField(scheme: String) {
        try {
            schemeField.isAccessible = true
            schemeField.set(httpUrl, scheme)
        } catch (e: IllegalAccessException) {
            e.printStackTrace()
        }
    }
    fun setPortField(port: Int) {
        try {
            portField.isAccessible = true
            portField.set(httpUrl, port)
        } catch (e: IllegalAccessException) {
            e.printStackTrace()
        }
    }

    private object Instance {
        val instance = BaseUrlHelper(
            HttpUrl.get(baseApi)
        )

        private val baseApi: String
            get() = "http://192.168.2.157:10000"
    }
}