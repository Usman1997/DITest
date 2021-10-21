package com.example.ditest.di

import com.example.core.repository.TestRepository
import com.example.ditest.domain.MainRepository
import com.example.ditest.domain.MainRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RootModule(private val testRepository: TestRepository) {

    @Provides
    @Singleton
    fun mainRepository(): MainRepository {
        return MainRepositoryImpl(testRepository)
    }
}