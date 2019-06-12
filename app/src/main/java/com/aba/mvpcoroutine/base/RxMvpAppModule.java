package com.aba.mvpcoroutine.base;

import android.content.Context;
import dagger.Module;
import dagger.Provides;

@Module
class RxMvpAppModule {

    private final Context context;

    public RxMvpAppModule(Context context) {
        this.context = context;
    }

    @Provides
    @AppScope
    public Context context() {
        return context;
    }




}
