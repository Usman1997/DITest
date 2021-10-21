package com.example.ditest.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.core.repository.TestRepository
import com.example.ditest.domain.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    mainRepository: MainRepository,
    testRepository: TestRepository
) : ViewModel() {

    private val coreState = MutableLiveData<String>()
    private val mainState = MutableLiveData<String>()

    init {
        coreState.value = testRepository.getValue()
        mainState.value = mainRepository.getValue()
    }

    fun coreState(): LiveData<String> = coreState
    fun mainState(): LiveData<String> = mainState
}