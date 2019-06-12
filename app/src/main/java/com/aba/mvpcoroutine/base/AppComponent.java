package com.aba.mvpcoroutine.base;

import android.content.Context;
import com.aba.mvpcoroutine.data.api.MainService;
import com.twistedequations.rx2.AndroidRxSchedulers;
import dagger.Component;


@AppScope
@Component(modules = {RxMvpAppModule.class,
        NetworkModule.class,
        GsonModule.class, RxModule.class})
public interface AppComponent {

    Context context();

    AndroidRxSchedulers rxSchedulers();

    MainService lastService();


}
