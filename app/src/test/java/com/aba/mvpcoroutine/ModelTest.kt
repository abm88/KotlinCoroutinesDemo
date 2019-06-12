package com.aba.mvpcoroutine

import com.aba.mvpcoroutine.data.api.MainService
import com.aba.mvpcoroutine.ui.home.mvp.MainModel
import com.nhaarman.mockitokotlin2.verifyNoMoreInteractions
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner




@RunWith(MockitoJUnitRunner::class)
class ModelTest {

    @Mock
    internal var service: MainService? = null

    @InjectMocks
    internal  var model : MainModel? = null

    @Test
    fun givenModel_whenGettingItems_thenTrue() = runBlocking {

        Mockito.`when`(service?.getItems()).thenReturn(null)

        val result = model?.getItems()


        Mockito.verify(service)?.getItems()


        assertEquals(result , null)


        verifyNoMoreInteractions(service)

    }

}