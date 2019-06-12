package com.aba.mvpcoroutine.ui.home.dagger

import com.aba.mvpcoroutine.base.AppComponent
import com.aba.mvpcoroutine.ui.home.MainFragment
import dagger.Component


@MainScope
@Component(modules = [MainModule::class] ,
    dependencies = [AppComponent::class] )
interface MainComponent {

    fun inject(fragment: MainFragment)

}