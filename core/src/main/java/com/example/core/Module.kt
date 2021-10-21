package com.example.core

import com.example.core.repository.TestRepository
import com.example.core.repository.TestRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class Module {

    @Provides
    @Singleton
    fun provideStringRepository(): StringRepository {
        return StringRepository()
    }

    @Provides
    @Singleton
    fun provideTestRepository(): TestRepository{
        return TestRepositoryImpl()
    }

}