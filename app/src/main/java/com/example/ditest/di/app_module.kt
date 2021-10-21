package com.example.ditest.di

import android.os.Build
import androidx.lifecycle.ViewModelProvider
import com.example.ditest.AppApplication
import org.kodein.di.Kodein
import com.example.ditest.domain.MainRepository
import com.example.ditest.domain.MainRepositoryImpl
import com.example.ditest.ui.MainViewModel
import com.example.ditest.util.ViewModelFactory
import com.example.ditest.ui.bindViewModel
import org.kodein.di.direct
import org.kodein.di.generic.*


val repositoryModule = Kodein.Module("repository_module"){
    bind<MainRepository>() with singleton {
        MainRepositoryImpl()
    }
}

val viewModelModule = Kodein.Module("viewmodel_module") {
    bindViewModel<MainViewModel>() with provider {
        MainViewModel(instance())
    }
}

val constantsModule = Kodein.Module(name = "constants") {
    constant("kodein") with "kodein"
}

fun rootModule(appApplication: AppApplication) = Kodein.Module("root"){
    bind<ViewModelProvider.Factory>() with singleton {
        ViewModelFactory(
            kodein.direct
        )
    }
}