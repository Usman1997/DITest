package com.example.ditest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.core.StringRepository
import com.example.core.repository.TestRepository
import com.example.ditest.AppApplication
import com.example.ditest.R
import dagger.hilt.android.AndroidEntryPoint
import org.kodein.di.KodeinAware
import org.kodein.di.android.closestKodein
import org.kodein.di.generic.instance
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity(), KodeinAware {

    private lateinit var tvKodein: TextView
    private lateinit var tvHilt: TextView
    private lateinit var tvHiltViewModel: TextView

    @Inject
    lateinit var testRepository: TestRepository

    @Inject
    lateinit var stringRepository: StringRepository

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
        tvHilt.text = testRepository.getValue()

        mainViewModel.state().observe(this){
            tvHiltViewModel.text = it
        }



    }

    override val kodein by closestKodein()
}

