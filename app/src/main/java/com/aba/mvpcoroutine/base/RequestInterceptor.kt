package com.aba.mvpcoroutine.base

import com.aba.mvpcoroutine.AppConstants
import okhttp3.Interceptor
import okhttp3.Response

class RequestInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {

        val originalRequest = chain.request()
        val originalUrl = originalRequest.url()
        val url = originalUrl.newBuilder()
            .addQueryParameter("app_key", AppConstants.APP_KEY )
            .addQueryParameter("app_id", AppConstants.APP_ID )
            .build()
        val requestBuilder = originalRequest.newBuilder().url(url)
        val request = requestBuilder.build()
        return chain.proceed(request)

    }
}