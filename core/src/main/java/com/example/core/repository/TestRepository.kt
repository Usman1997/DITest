package com.example.core.repository

import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

interface TestRepository {

    fun getValue(): String
}

class TestRepositoryImpl(): TestRepository{
    override fun getValue(): String {
        return "Hello from core Hilt Repository"
    }

}