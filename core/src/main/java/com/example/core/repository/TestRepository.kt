package com.example.core.repository

import javax.inject.Inject

interface TestRepository {

    fun getValue(): String
}

class TestRepositoryImpl: TestRepository{
    override fun getValue(): String {
        return "Hello from Dagger Test Repository"
    }

}