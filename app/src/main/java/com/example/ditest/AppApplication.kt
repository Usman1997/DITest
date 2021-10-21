package com.example.ditest

import android.app.Application
import com.example.core.di.DaggerWrapper
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AppApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        DaggerWrapper.initComponent()
    }
}