package com.suleymancelik.movieclient.ui.dashboard

import com.suleymancelik.movieclient.core.network.SuspendingWorkInteractor
import kotlinx.coroutines.CoroutineDispatcher
import com.suleymancelik.movieclient.data.extension.Result
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class DashboardNowPlayingWork @Inject constructor(
    private val mDashboardRepository: DashboardRepository
) : SuspendingWorkInteractor<DashboardNowPlayingWork.Params, Result<List<String>>>() {
    override val dispatcher: CoroutineDispatcher = Dispatchers.IO

    override suspend fun doWork(params: Params): Result<List<String>> {
        return mDashboardRepository.fetchNowPlayingMovieList()
    }

    data class Params(val query: String)
}