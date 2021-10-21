package com.example.ditest.domain

import com.example.core.repository.TestRepository
import javax.inject.Inject


interface MainRepository {
    fun getValueFromCoreModule(): String
}

class MainRepositoryImpl() : MainRepository {
    override fun getValueFromCoreModule(): String {
        return "Hello From Kodin Repository"
    }

}