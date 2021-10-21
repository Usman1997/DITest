package com.example.ditest.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.core.repository.TestRepository
import com.example.ditest.domain.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


class MainViewModel(
    private val mainRepository: MainRepository
) : ViewModel() {

    private val state = MutableLiveData<String>()


    init {
        state.value = mainRepository.getValueFromCoreModule()
    }

    fun state(): LiveData<String> = state
}