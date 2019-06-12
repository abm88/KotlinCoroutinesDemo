package com.aba.mvpcoroutine.base

import androidx.annotation.NonNull
import com.aba.mvpcoroutine.AppConstants
import com.aba.mvpcoroutine.base.AppScope
import com.aba.mvpcoroutine.data.api.MainService
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import com.twistedequations.rx2.AndroidRxSchedulers
import dagger.Module
import dagger.Provides

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


@Module
class NetworkModule {

    @AppScope
    @Provides
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    @AppScope
    @Provides
    fun provideHttpClient() : OkHttpClient{
        return OkHttpClient.Builder()
            .connectTimeout(12, TimeUnit.SECONDS)
            .readTimeout(12, TimeUnit.SECONDS)
            .addInterceptor(RequestInterceptor())
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .build()
    }

    @AppScope
    @Provides
    fun proviudeRetrofit(@NonNull okHttpClient :  OkHttpClient, androidRxSchedulers: AndroidRxSchedulers) : Retrofit {

        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(AppConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
//            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(androidRxSchedulers.network()))
//            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    @AppScope
    @Provides
    fun provideLastListService(@NonNull retrofit: Retrofit) : MainService {
        return retrofit.create(MainService::class.java)
    }






}