package com.aba.mvpcoroutine.ui.home.dagger

import com.aba.mvpcoroutine.data.api.MainService
import com.aba.mvpcoroutine.ui.home.MainFragment
import com.aba.mvpcoroutine.ui.home.mvp.MainModel
import com.aba.mvpcoroutine.ui.home.mvp.MainPresenter
import com.aba.mvpcoroutine.ui.home.mvp.MainView
import com.aba.mvpcoroutine.ui.home.mvp.MainViewImpl
import dagger.Module
import dagger.Provides


@Module
class MainModule(val mainFragment: MainFragment) {


    @Provides
    @MainScope
    fun providesView() : MainView {
        return MainViewImpl(mainFragment)
    }


    @Provides
    @MainScope
    fun providesModel(mainService : MainService ) : MainModel {
        return MainModel(mainService)
    }



    @Provides
    @MainScope
    fun providePresenter(model: MainModel , view: MainView) : MainPresenter{
        return MainPresenter(mainFragment , model, view)
    }



}