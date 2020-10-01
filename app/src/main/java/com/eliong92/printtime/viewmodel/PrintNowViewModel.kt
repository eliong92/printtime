package com.eliong92.printtime.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.threeten.bp.LocalDateTime
import org.threeten.bp.format.DateTimeFormatter

class PrintNowViewModel : ViewModel() {
    val currentTime = MutableLiveData<String>()

    fun showCurrentTime() {
        currentTime.value = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))
    }
}