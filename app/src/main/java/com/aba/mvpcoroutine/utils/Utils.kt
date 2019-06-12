package com.aba.mvpcoroutine.utils

import android.content.Context
import android.view.View

class Utils {

    companion object {
        fun showProgress(context: Context , view : View){

            view.visibility = View.VISIBLE

        }

        fun hideProgress(context: Context , view : View){
            view.visibility = View.GONE

        }
    }
}