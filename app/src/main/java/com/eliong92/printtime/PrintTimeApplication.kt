package com.eliong92.printtime

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen

class PrintTimeApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
    }
}