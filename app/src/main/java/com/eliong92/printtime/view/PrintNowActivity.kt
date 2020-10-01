package com.eliong92.printtime.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.eliong92.printtime.R
import com.eliong92.printtime.databinding.ActivityPrintNowBinding
import com.eliong92.printtime.viewmodel.PrintNowViewModel

class PrintNowActivity : AppCompatActivity() {

    private lateinit var viewModel: PrintNowViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityPrintNowBinding>(this, R.layout.activity_print_now)
        viewModel = ViewModelProvider(this).get(PrintNowViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        viewModel.showCurrentTime()
    }
}