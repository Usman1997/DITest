package com.example.ditest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import com.example.core.repository.TestRepository
import com.example.ditest.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var tvHilt: TextView
    private lateinit var tvHiltViewModel: TextView

    @Inject
    lateinit var testRepository: TestRepository


    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHilt = findViewById(R.id.tvHilt)
        tvHiltViewModel = findViewById(R.id.tvHiltViewModel)




        mainViewModel.mainState().observe(this) {
            tvHilt.text = it
        }

        mainViewModel.coreState().observe(this) {
            tvHiltViewModel.text = it
        }


    }

}

