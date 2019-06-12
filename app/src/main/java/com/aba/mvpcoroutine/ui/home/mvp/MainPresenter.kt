package com.aba.mvpcoroutine.ui.home.mvp

import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import com.aba.mvpcoroutine.data.model.Point.SitePointResult
import com.aba.mvpcoroutine.data.model.Road.Road
import com.aba.mvpcoroutine.ui.home.MainFragment
import com.aba.mvpcoroutine.utils.CustomLifeCycleObserver
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import kotlinx.coroutines.*

class MainPresenter(val fragment : MainFragment ,
                    val model : MainModel ,
                    val view : MainView ) {



    private val compositeDisposable = CompositeDisposable()
    lateinit var result : Deferred<List<SitePointResult>>
    private lateinit var lifeCycleListener : CustomLifeCycleObserver
    private lateinit var handler : Handler
    private var lifeCycleStateCounter = 0L


    fun onCreate(){

        handler = Handler()

        lifeCycleListener = CustomLifeCycleObserver(fragment.context!! , fragment.lifecycle){ state ->
            Log.d(CustomLifeCycleObserver.TAG, "binding lifecycle owner called ")
            handler.postDelayed({
                view.showLifecycleState(state)
            } , lifeCycleStateCounter * 1000)
            lifeCycleStateCounter++
            if(lifeCycleStateCounter == 5L ){
                lifeCycleStateCounter = 0L
            }
        }

        fragment.lifecycle.addObserver(lifeCycleListener)

    }

    fun onDestroy(){
        compositeDisposable.clear()
    }

    fun initUI(){
        compositeDisposable.add(subscribetoDataBtn())

    }

    fun subscribetoDataBtn(): Disposable {
        return view.subscribeToGetDataButton().subscribe {

//            view.showProgress(true)

            getData()

        }


    }

    private fun getData() = runBlocking{

        view.showProgress(true)

//        getAndProcessData()

        launch {
            try {
                view.showTitle(model.getItems().await()[0].id!!)
                view.showProgress(false)

            } catch (e: Exception) {
                Log.e("testTag" , e.toString())
            }
//            view.showProgress(false)
        }
    }


//    suspend fun getAndProcessData(){
//
//        var points :  Deferred<List<SitePointResult>>? = null
//        var roads :  Deferred<List<Road>>? = null
//
////        view.showProgress(true)
//
//        coroutineScope {
//
//            points = async {
//                model.getItems()
//            }
//
//            roads = async {
//                model.getRodas()
//            }
//
//
//        }
//
//
//
//        view.showProgress(roads!!.await() == null )
//
//        view.showTitle(roads!!.await()[0].displayName + " + " + points!!.await()[0].commonName)
//
//    }


}