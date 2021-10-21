package com.example.ditest.domain

interface MainRepository {
    fun getValue(): String
}

class MainRepositoryImpl() : MainRepository {
    override fun getValue(): String {
        return "Hello From Hilt Local Repository"
    }

}