package com.suleymancelik.movieclient.di

import com.suleymancelik.movieclient.BaseApplication
import com.suleymancelik.movieclient.core.di.CoreComponent
import com.suleymancelik.movieclient.core.di.viewmodel.FactoriesMap
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Named

@Component(
    modules = [
        ActivityBuilder::class,
        AppModule::class,
        AndroidSupportInjectionModule::class
    ],
    dependencies = [CoreComponent::class]
)
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance application: BaseApplication,
            coreComponent: CoreComponent
        ): AppComponent
    }

    fun viewModelFactories(): FactoriesMap
}