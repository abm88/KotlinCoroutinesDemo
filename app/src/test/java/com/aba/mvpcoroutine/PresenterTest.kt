package com.aba.mvpcoroutine

import com.aba.mvpcoroutine.config.RxSchedulerTestRule
import com.aba.mvpcoroutine.ui.home.MainFragment
import com.aba.mvpcoroutine.ui.home.mvp.MainModel
import com.aba.mvpcoroutine.ui.home.mvp.MainPresenter
import com.aba.mvpcoroutine.ui.home.mvp.MainView
import com.nhaarman.mockitokotlin2.*
import io.reactivex.Observable
import io.reactivex.observers.TestObserver
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers
import org.mockito.ArgumentMatchers.anyObject
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner



@RunWith(MockitoJUnitRunner::class)
//@RunWith(PowerMockRunner::class)
class PresenterTest {


//    @Rule
//    public var rxRule = RxSchedulerTestRule()


    @Mock
    var model : MainModel? = null


    @Mock
    var view : MainView? = null

    @Mock
    var fragment: MainFragment? = null


    @InjectMocks
    var presenter : MainPresenter? = null


    @Before
    fun init(){
//        PowerMockito.mockStatic(Observable::class.java)
    }

    @Test
    fun givenPresenter_whenInit_thenTrue()  = runBlocking{

        val testObserver = TestObserver<Any>()

//        Mockito.`when`(view?.subscribeToGetDataButton()).thenReturn(ArgumentMatchers.eq(Observable.just(Any())))
//        view?.subscribeToGetDataButton()?.subscribe(testObserver)

//        doNothing().`when`(view)?.subscribeToGetDataButton()

        Mockito.`when`(model?.getItems()).thenReturn(null)

        presenter?.onCreate()



        verify(model , never())?.getItems()

        verify(view , never())?.showProgress(ArgumentMatchers.anyBoolean())


        verifyNoMoreInteractions(view)

        verifyNoMoreInteractions(model)


    }


}