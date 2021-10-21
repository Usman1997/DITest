package com.example.ditest.domain

import com.example.core.repository.TestRepository
import javax.inject.Inject


interface MainRepository {
    fun getValue(): String
}

class MainRepositoryImpl() : MainRepository {
    override fun getValue(): String {
        return "Hello From Hilt Repository"
    }

}