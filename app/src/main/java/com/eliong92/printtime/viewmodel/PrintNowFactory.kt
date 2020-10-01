package com.eliong92.printtime.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.eliong92.printtime.util.IDateUtil
import javax.inject.Inject

class PrintNowFactory @Inject constructor(
    val dateUtil: IDateUtil
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PrintNowViewModel(dateUtil) as T
    }
}