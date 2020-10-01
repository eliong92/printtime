package com.eliong92.printtime.di

import com.eliong92.printtime.util.DateUtil
import com.eliong92.printtime.util.IDateUtil
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideDateUtil(): IDateUtil {
        return DateUtil()
    }
}