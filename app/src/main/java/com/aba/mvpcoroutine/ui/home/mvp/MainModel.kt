package com.aba.mvpcoroutine.ui.home.mvp

import com.aba.mvpcoroutine.data.api.MainService
import com.aba.mvpcoroutine.data.model.Point.SitePointResult
import com.aba.mvpcoroutine.data.model.Road.Road
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MainModel(private val service : MainService) {



    suspend fun getItems() : Deferred<List<SitePointResult>> = withContext(Dispatchers.IO){
        service.getItems()
    }



    suspend fun getRodas() : Deferred<List<Road>> = withContext(Dispatchers.IO){
        service.getRoads()
    }




}