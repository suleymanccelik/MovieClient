package com.suleymancelik.movieclient.di

import android.content.Context
import com.suleymancelik.movieclient.BaseApplication
import com.suleymancelik.movieclient.ui.dashboard.DashboardModule
import dagger.Module
import dagger.Provides

@Module(
    includes = [DashboardModule::class]
)
class AppModule {

    @Provides
    fun provideContext(application: BaseApplication): Context = application.applicationContext

}