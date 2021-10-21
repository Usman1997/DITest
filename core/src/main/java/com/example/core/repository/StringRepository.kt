package com.example.core.repository


interface StringRepository {
    fun getValue(): String
}

class StringRepositoryImpl(private val testRepository: TestRepository) : StringRepository {

    override fun getValue(): String {
        return testRepository.getValue() + " and String Repository"
    }
}