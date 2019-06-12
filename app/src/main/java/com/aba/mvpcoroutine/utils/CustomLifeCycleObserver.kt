package com.aba.mvpcoroutine.utils

import android.content.ComponentCallbacks
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class CustomLifeCycleObserver(private val context: Context ,
                              private val lifeCyle : Lifecycle ,
                              private val callbacks: (text : String) -> Unit ) : LifecycleObserver{
    companion object {
        const val TAG = "mCustomLifeCycleObsrvr"
    }



    /*
    Events
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        callbacks.invoke("on Create")
        Log.d(TAG , "on create called , State : ${lifeCyle.currentState}")
//        Toast.makeText(context ,
//            "on create called , State : ${lifeCyle.currentState}" , Toast.LENGTH_SHORT).show()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart(){
        callbacks.invoke("on Start")
        Log.d(TAG , "on start called , State : ${lifeCyle.currentState}")
//        Toast.makeText(context ,
//            "on start called , State : ${lifeCyle.currentState}" , Toast.LENGTH_SHORT).show()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(){
        Log.d(TAG , "on resume called , State : ${lifeCyle.currentState}")
//        Toast.makeText(context ,
//            "on resume called , State : ${lifeCyle.currentState}" , Toast.LENGTH_SHORT).show()
        callbacks.invoke("on Resume")

    }


    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause(){
        Log.d(TAG , "on pause called , State : ${lifeCyle.currentState}")
//        Toast.makeText(context ,
//            "on pause called , State : ${lifeCyle.currentState}" , Toast.LENGTH_SHORT).show()
        callbacks.invoke("on Puase")

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop(){
        Log.d(TAG , "on stop called , State : ${lifeCyle.currentState}")
//        Toast.makeText(context ,
//            "on stop called , State : ${lifeCyle.currentState}" , Toast.LENGTH_SHORT).show()
        callbacks.invoke("on Stop")

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy(){
        Log.d(TAG , "on destroy called , State : ${lifeCyle.currentState}")
//        Toast.makeText(context ,
//            "on destroy called , State : ${lifeCyle.currentState}" , Toast.LENGTH_SHORT).show()
        callbacks.invoke("on Destroy")

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun onAny(){

        Log.d(TAG , "on any called , State : ${lifeCyle.currentState}")
//        Toast.makeText(context ,
//            "on any called , State : ${lifeCyle.currentState}" , Toast.LENGTH_SHORT).show()
        callbacks.invoke("on Any")

    }







}