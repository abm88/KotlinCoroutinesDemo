package com.aba.mvpcoroutine.data.api

import com.aba.mvpcoroutine.data.model.Point.SitePointResult
import com.aba.mvpcoroutine.data.model.Road.Road
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface MainService {




    @GET("Line/victoria/StopPoints")
    fun getItems() : Deferred<List<SitePointResult>>


    @GET("Road")
    fun getRoads() : Deferred<List<Road>>


}