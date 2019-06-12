package com.aba.mvpcoroutine.base

import com.aba.mvpcoroutine.base.AppScope
import com.twistedequations.rx2.AndroidRxSchedulers
import com.twistedequations.rx2.DefaultAndroidRxSchedulers
import dagger.Module
import dagger.Provides


@Module
class RxModule {

    @AppScope
    @Provides
    fun rxSchedulers(): AndroidRxSchedulers {

        return DefaultAndroidRxSchedulers()

    }
}