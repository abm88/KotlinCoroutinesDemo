package com.aba.mvpcoroutine.base

import android.app.Activity
import android.app.Application
import android.app.Service


class RxMvpApp : Application() {

    private var sApplication: Application? = null

    companion object {

        @JvmStatic
        fun get(activity: Activity): RxMvpApp {
            return activity.application as RxMvpApp
        }

        @JvmStatic
        fun getApplication(): Application {
            return Application().applicationContext as Application
        }

        @JvmStatic
        fun get(service: Service): RxMvpApp {
            return service.application as RxMvpApp
        }
    }

    private val rxMvpAppComponent: AppComponent by lazy {
        DaggerAppComponent.builder().rxMvpAppModule(RxMvpAppModule(this)).build()
    }

    override fun onCreate() {
        super.onCreate()


    }

    fun component(): AppComponent {
        return rxMvpAppComponent
    }




}