package com.example.ditest.di

import com.example.ditest.domain.MainRepository
import com.example.ditest.domain.MainRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideMainRepository(): MainRepository {
        return MainRepositoryImpl()
    }

}