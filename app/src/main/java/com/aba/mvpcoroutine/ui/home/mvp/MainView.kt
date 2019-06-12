package com.aba.mvpcoroutine.ui.home.mvp

import android.view.View
import io.reactivex.Observable

interface MainView {


    val view : View

    fun subscribeToGetDataButton() : Observable<Any>
    fun showProgress(aBoolean: Boolean)
    fun showTitle(data: String)
    fun showLifecycleState(state: String)

}