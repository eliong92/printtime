package com.eliong92.printtime.di

import com.eliong92.printtime.view.PrintNowActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector
    abstract fun bindPrintNowActivity(): PrintNowActivity
}