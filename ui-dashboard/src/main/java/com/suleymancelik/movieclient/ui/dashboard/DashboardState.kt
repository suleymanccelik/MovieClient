package com.suleymancelik.movieclient.ui.dashboard

import com.airbnb.mvrx.Async
import com.airbnb.mvrx.MavericksState
import com.airbnb.mvrx.Uninitialized
import com.suleymancelik.movieclient.data.model.NowPlayingMovieListModel
import com.suleymancelik.movieclient.data.model.UpcomingMovieListModel

data class DashboardState(
    val dashboardUpcomingMovieListState: Async<Result<List<UpcomingMovieListModel>>> = Uninitialized,
    val dashboardNowPlayingMovieListState: Async<Result<List<NowPlayingMovieListModel>>> = Uninitialized
) : MavericksState