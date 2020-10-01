package com.eliong92.printtime.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.eliong92.printtime.R
import com.eliong92.printtime.databinding.ActivityPrintNowBinding
import com.eliong92.printtime.viewmodel.PrintNowFactory
import com.eliong92.printtime.viewmodel.PrintNowViewModel
import dagger.android.AndroidInjection
import javax.inject.Inject

class PrintNowActivity : AppCompatActivity() {

    private lateinit var viewModel: PrintNowViewModel

    @Inject lateinit var viewModelFactory: PrintNowFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityPrintNowBinding>(this, R.layout.activity_print_now)
        viewModel = ViewModelProvider(this, viewModelFactory).get(PrintNowViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        viewModel.showCurrentTime()
    }
}