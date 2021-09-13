package com.suleymancelik.movieclient.ui.dashboard

import com.suleymancelik.movieclient.core.di.MvRxViewModel
import com.suleymancelik.movieclient.core.di.viewmodel.AssistedViewModelFactory
import com.suleymancelik.movieclient.core.di.viewmodel.DaggerMvRxViewModelFactory
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

class DashboardViewModel @AssistedInject constructor(
    @Assisted state: DashboardState,
    private val mDashboardNowPlayingWork: DashboardNowPlayingWork,
    private val mDashboardUpComingWork: DashboardUpComingWork
) : MvRxViewModel<DashboardState>(state) {



    @AssistedFactory
    interface Factory : AssistedViewModelFactory<DashboardViewModel, DashboardState> {
        override fun create(state: DashboardState): DashboardViewModel
    }

    companion object :
        DaggerMvRxViewModelFactory<DashboardViewModel, DashboardState>(
            DashboardViewModel::class.java
        )

}