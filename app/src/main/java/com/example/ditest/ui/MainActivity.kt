package com.example.ditest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import com.example.ditest.AppApplication
import com.example.ditest.R
import dagger.hilt.android.AndroidEntryPoint
import org.kodein.di.KodeinAware
import org.kodein.di.android.closestKodein
import org.kodein.di.generic.instance

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var tvHilt: TextView
    private lateinit var tvHiltViewModel: TextView

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHilt = findViewById(R.id.tvHilt)
        tvHiltViewModel = findViewById(R.id.tvHiltViewModel)

        mainViewModel.state().observe(this){
            tvHiltViewModel.text = it
        }



    }

}

