package com.eliong92.printtime.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.eliong92.printtime.util.IDateUtil

class PrintNowViewModel(
    private val dateUtil: IDateUtil
) : ViewModel() {
    val currentTime = MutableLiveData<String>()

    fun showCurrentTime() {
        currentTime.value = dateUtil.getCurrentTime("HH:mm:ss")
    }
}