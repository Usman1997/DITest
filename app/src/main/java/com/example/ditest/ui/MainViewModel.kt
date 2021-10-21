package com.example.ditest.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.core.di.DaggerWrapper
import com.example.core.repository.StringRepository
import com.example.core.repository.TestRepository
import com.example.ditest.domain.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository
) : ViewModel() {

    private val stringRepository: StringRepository =
        DaggerWrapper.getComponent().getStringRepository()

    private val state = MutableLiveData<String>()

    init {
        state.value = stringRepository.getValue()
    }

    fun state(): LiveData<String> = state
}