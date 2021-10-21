package com.example.core.di

import com.example.core.repository.StringRepository
import com.example.core.repository.TestRepository
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        RootModule::class
    ]
)

interface RootComponent {

    fun getTestRepository(): TestRepository

    fun getStringRepository(): StringRepository
}