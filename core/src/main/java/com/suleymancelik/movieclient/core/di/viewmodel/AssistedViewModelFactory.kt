package com.suleymancelik.movieclient.core.di.viewmodel

import com.airbnb.mvrx.MavericksState
import com.suleymancelik.movieclient.core.di.MvRxViewModel

interface AssistedViewModelFactory<VM: MvRxViewModel<S>, S: MavericksState> {
    fun create(state: S): VM
}

typealias FactoriesMap = Map<Class<out MvRxViewModel<*>>, AssistedViewModelFactory<*, *>>