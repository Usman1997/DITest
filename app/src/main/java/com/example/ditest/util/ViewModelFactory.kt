/*
 * Copyright © GeoMobile GmbH - All rights reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.  
 * Proprietary and confidential. 
 * Created by Feng Feng on 27.4.2020. 
 */

package com.example.ditest.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.kodein.di.DKodein
import org.kodein.di.generic.instanceOrNull

class ViewModelFactory(private val injector: DKodein) : ViewModelProvider.Factory{

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return injector.instanceOrNull<ViewModel>(tag = modelClass.simpleName) as? T?
            ?: modelClass.newInstance()
    }
}