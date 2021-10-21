package com.example.core.di

import com.example.core.repository.StringRepository
import com.example.core.repository.StringRepositoryImpl
import com.example.core.repository.TestRepository
import com.example.core.repository.TestRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RootModule {

    @Provides
    @Singleton
    fun provideTestRepository(): TestRepository {
        return TestRepositoryImpl()
    }

    @Provides
    @Singleton
    fun provideStringRepository(testRepository: TestRepository): StringRepository {
        return StringRepositoryImpl(testRepository)
    }
}