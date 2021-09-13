package com.suleymancelik.movieclient.core.di.viewmodel

import com.suleymancelik.movieclient.core.di.MvRxViewModel
import dagger.MapKey
import kotlin.reflect.KClass

/**
 * A [MapKey] for populating a map of ViewModels and their factories
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
@MapKey
annotation class ViewModelKey(val value: KClass<out MvRxViewModel<*>>)