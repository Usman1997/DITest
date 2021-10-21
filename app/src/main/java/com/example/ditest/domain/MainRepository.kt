package com.example.ditest.domain

import com.example.core.repository.TestRepository
import javax.inject.Inject


interface MainRepository {
    fun getValueFromCoreModule(): String
}

class MainRepositoryImpl @Inject constructor(private val testRepository: TestRepository) : MainRepository {
    override fun getValueFromCoreModule(): String {
        return testRepository.getValue()
    }

}