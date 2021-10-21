package com.example.ditest.di

import com.example.ditest.domain.MainRepository
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        RootModule::class
    ]
)

interface RootComponent {
    fun getMainRepository(): MainRepository
}