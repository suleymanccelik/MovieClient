package com.suleymancelik.movieclient.core.di

import android.content.Context
import com.suleymancelik.movieclient.core.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import okhttp3.OkHttpClient
import retrofit2.Retrofit

@Component(
    modules = [
        NetworkModule::class
    ]
)
interface CoreComponent {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context
        ): CoreComponent
    }

    fun provideOkHttpClient(): OkHttpClient

    fun provideRetrofit(): Retrofit

}