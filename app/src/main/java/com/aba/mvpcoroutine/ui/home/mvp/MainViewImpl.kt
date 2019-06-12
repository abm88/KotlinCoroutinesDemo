package com.aba.mvpcoroutine.ui.home.mvp

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.aba.mvpcoroutine.R
import com.aba.mvpcoroutine.ui.home.MainFragment
import com.aba.mvpcoroutine.utils.Utils
import com.jakewharton.rxbinding2.view.RxView
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.blank_fragment.view.*

@SuppressLint("ViewConstructor")
class MainViewImpl(val fragment: MainFragment) : MainView ,
    FrameLayout(fragment.context!!) {



    override val view: View
        get() = this


    init {

        layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT)
        View.inflate(context , R.layout.blank_fragment , this)

    }


    override fun subscribeToGetDataButton(): Observable<Any> {
        return RxView.clicks(btnMain)

    }


    override fun showProgress(aBoolean: Boolean) {

        (fragment.context as Activity).runOnUiThread {
            if (aBoolean){
                Utils.showProgress(context ,mainProgress )
            }else{
                Utils.hideProgress(context ,mainProgress )
            }
        }

    }
    override fun showTitle(data: String) {
        (fragment.context as Activity).runOnUiThread {
            mainTitle.text = data
        }
    }


    override fun showLifecycleState(state: String) {
        (fragment.context as Activity).runOnUiThread {
//            mainState.text = state
        }
        mainState.text = state

    }


}