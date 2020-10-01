package com.eliong92.printtime

import androidx.lifecycle.Observer
import com.eliong92.printtime.viewmodel.PrintNowViewModel
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.extension.ExtendWith
import org.threeten.bp.LocalDateTime
import org.threeten.bp.format.DateTimeFormatter

@ExtendWith(InstantExecutorExtension::class)
class PrintNowViewModelTest {

    private lateinit var viewModel: PrintNowViewModel

    @BeforeEach
    fun setup() {
        viewModel = PrintNowViewModel()
    }

    @RepeatedTest(1000000)
    fun showCurrentTime_shouldShowTime() {
        val observer: Observer<String> = mock()
        viewModel.currentTime.observeForever(observer)
        val expectedTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))

        viewModel.showCurrentTime()

        verify(observer).onChanged(expectedTime)
    }
}