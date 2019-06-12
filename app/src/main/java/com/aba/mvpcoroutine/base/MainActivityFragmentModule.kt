package com.aba.mvpcoroutine.base

import com.aba.mvpcoroutine.base.AppScope
import com.aba.mvpcoroutine.ui.home.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector



@Suppress("unused")
@Module
abstract class MainActivityFragmentModule{

    @AppScope
    @ContributesAndroidInjector
    abstract fun contributeHomeFragment() : MainFragment


}