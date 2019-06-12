package com.aba.mvpcoroutine.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.aba.mvpcoroutine.R
import com.aba.mvpcoroutine.utils.CustomLifeCycleObserver

class MainActivity : AppCompatActivity() {


    private lateinit var fragment: Fragment

    companion object {
        const val TAG = "mMainActivity"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragment = findOrReplaceFragment()





    }

    private fun findOrReplaceFragment(): Fragment {

        var f = supportFragmentManager
            .findFragmentById(R.id.mainFragment)

        if (f == null) {
            f = MainFragment.newInstance()
            supportFragmentManager
                .beginTransaction().replace(R.id.mainFragment, f).commit()
        }

        return f
    }
}
