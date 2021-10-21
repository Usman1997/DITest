package com.example.ditest

import android.app.Application
import com.example.core.di.DaggerWrapper
import com.example.ditest.di.DaggerRootComponent
import com.example.ditest.di.RootComponent
import com.example.ditest.di.RootModule


class AppApplication : Application() {
    lateinit var rootComponent: RootComponent

    override fun onCreate() {
        super.onCreate()
        rootComponent = DaggerRootComponent.builder()
            .rootModule(RootModule(DaggerWrapper.getComponent().getTestRepository()))
            .build()
    }

}