package com.suleymancelik.movieclient.ui.dashboard

import com.suleymancelik.movieclient.core.di.viewmodel.AssistedViewModelFactory
import com.suleymancelik.movieclient.core.di.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface DashboardModule {

    @Binds
    @IntoMap
    @ViewModelKey(DashboardViewModel::class)
    fun dashboardViewModelFactory(factory: DashboardViewModel.Factory): AssistedViewModelFactory<*, *>

}