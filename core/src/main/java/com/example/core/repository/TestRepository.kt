package com.example.core.repository


interface TestRepository {

    fun getValue(): String
}

class TestRepositoryImpl(): TestRepository{

    override fun getValue(): String {
        return "Hello from core Hilt Repository"
    }

}