package com.suleymancelik.movieclient.core.network

sealed class InvokeStatus
object InvokeIdle : InvokeStatus()
object InvokeStarted : InvokeStatus()
object InvokeSuccess : InvokeStatus()
data class InvokeError(val throwable: Throwable) : InvokeStatus()