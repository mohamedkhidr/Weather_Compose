package com.khidrew.myweather.models

sealed class Result<out T> {
    data class Success<T>(val data:T):Result<T>()
    data class Error(val message:String):Result<Nothing>()
    data object Loading:Result<Nothing>()
}