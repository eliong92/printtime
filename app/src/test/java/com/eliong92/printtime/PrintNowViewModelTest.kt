package com.eliong92.printtime

import androidx.lifecycle.Observer
import com.eliong92.printtime.util.DateUtil
import com.eliong92.printtime.util.IDateUtil
import com.eliong92.printtime.viewmodel.PrintNowViewModel
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.threeten.bp.LocalDateTime
import org.threeten.bp.format.DateTimeFormatter

@ExtendWith(InstantExecutorExtension::class)
class PrintNowViewModelTest {

    private lateinit var viewModel: PrintNowViewModel

    @Mock
    lateinit var dateUtil: IDateUtil

    @BeforeEach
    fun setup() {
        MockitoAnnotations.initMocks(this)
        viewModel = PrintNowViewModel(dateUtil)
    }

    @RepeatedTest(100000)
    fun showCurrentTime_shouldShowTime() {
        val observer: Observer<String> = mock()
        viewModel.currentTime.observeForever(observer)
        val expectedTime = "23:00:45"
        whenever(dateUtil.getCurrentTime("HH:mm:ss")).thenReturn(expectedTime)

        viewModel.showCurrentTime()

        verify(observer).onChanged(expectedTime)
    }
}