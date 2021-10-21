package com.example.ditest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.ditest.AppApplication
import com.example.ditest.R
import org.kodein.di.KodeinAware
import org.kodein.di.android.closestKodein
import org.kodein.di.generic.instance


class MainActivity : AppCompatActivity(), KodeinAware {

    private lateinit var tvKodein: TextView
    private lateinit var tvHilt: TextView
    private lateinit var tvHiltViewModel: TextView

    private val mainViewModel: MainViewModel by kodeinViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvKodein = findViewById(R.id.tvKodein)
        tvHilt = findViewById(R.id.tvHilt)
        tvHiltViewModel = findViewById(R.id.tvHiltViewModel)

        val kodein = (applicationContext as AppApplication).kodein
        val debug: String by kodein.instance(tag = "kodein")

        tvKodein.text = debug

        mainViewModel.state().observe(this){
            tvHiltViewModel.text = it
        }



    }

    override val kodein by closestKodein()
}

