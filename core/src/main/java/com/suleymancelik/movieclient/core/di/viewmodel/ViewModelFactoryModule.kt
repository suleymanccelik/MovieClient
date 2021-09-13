package com.suleymancelik.movieclient.core.di.viewmodel

import com.suleymancelik.movieclient.core.di.MvRxViewModel
import dagger.Module
import dagger.Provides

@Module
class ViewModelFactoryModule {

    @Provides
    fun provideMap(viewModelFactoryMap: Map<Class<out MvRxViewModel<*>>, AssistedViewModelFactory<*, *>>):
            Map<Class<out MvRxViewModel<*>>, AssistedViewModelFactory<*, *>> = viewModelFactoryMap
}