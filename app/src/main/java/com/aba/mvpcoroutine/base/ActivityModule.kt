package com.aba.mvpcoroutine.base

import com.aba.mvpcoroutine.ui.home.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Suppress("unused")
@Module
abstract class ActivityModule{

    @AppScope
    @ContributesAndroidInjector(modules = [MainActivityFragmentModule::class])
    internal abstract fun contributeMainActivity() : MainActivity

}