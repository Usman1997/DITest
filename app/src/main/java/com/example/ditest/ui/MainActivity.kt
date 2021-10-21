package com.example.ditest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.ditest.AppApplication
import com.example.ditest.R
import com.example.ditest.di.DaggerRootComponent


class MainActivity : AppCompatActivity() {

    private lateinit var tvKodein: TextView
    private lateinit var tvHilt: TextView
    private lateinit var tvHiltViewModel: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainRepository = (application as AppApplication).rootComponent.getMainRepository()

        tvKodein = findViewById(R.id.tvKodein)
        tvHilt = findViewById(R.id.tvHilt)
        tvHiltViewModel = findViewById(R.id.tvHiltViewModel)

        tvHiltViewModel.text = mainRepository.getValueFromCoreModule()

    }

}

