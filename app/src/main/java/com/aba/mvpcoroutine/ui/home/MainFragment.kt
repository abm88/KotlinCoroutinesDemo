package com.aba.mvpcoroutine.ui.home

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.aba.mvpcoroutine.R
import com.aba.mvpcoroutine.base.RxMvpApp
import com.aba.mvpcoroutine.ui.home.dagger.DaggerMainComponent
import com.aba.mvpcoroutine.ui.home.dagger.MainComponent
import com.aba.mvpcoroutine.ui.home.dagger.MainModule
import com.aba.mvpcoroutine.ui.home.mvp.MainPresenter
import com.aba.mvpcoroutine.ui.home.mvp.MainView
import javax.inject.Inject

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }


    @Inject
    lateinit var presenter : MainPresenter

    @Inject
    lateinit var view : MainView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return view.view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerMainComponent.builder()
            .appComponent(
                RxMvpApp.get(activity as Activity)
                .component())
            .mainModule(MainModule(this)).build().inject(this)

        presenter.onCreate()
        presenter.initUI()

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }


    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }

}
