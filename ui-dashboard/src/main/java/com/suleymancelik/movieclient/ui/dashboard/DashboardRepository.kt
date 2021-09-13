package com.suleymancelik.movieclient.ui.dashboard

import com.suleymancelik.movieclient.core.network.NetworkHelper
import com.suleymancelik.movieclient.data.extension.ErrorResult
import com.suleymancelik.movieclient.data.extension.Success
import retrofit2.Retrofit
import javax.inject.Inject

class DashboardRepository @Inject constructor() {

    @Inject
    lateinit var mApiClient: Retrofit

    @Inject
    lateinit var mNetworkHelper: NetworkHelper

    suspend fun fetchNowPlayingMovieList() = try {
        Success(emptyList<String>())
    } catch (e: Exception) {
        ErrorResult(e)
    }
}

