package com.example.ditest

import android.app.Application
import com.example.ditest.di.constantsModule
import com.example.ditest.di.repositoryModule
import com.example.ditest.di.rootModule
import com.example.ditest.di.viewModelModule
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware

class AppApplication : Application(), KodeinAware {

    override val kodein: Kodein = Kodein.lazy {
        import(viewModelModule)
        import(repositoryModule)
        import(constantsModule)
        import(rootModule((this@AppApplication)))
    }

}