package ru.yandex.buggyweatherapp

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp
import ru.yandex.buggyweatherapp.utils.ImageLoader

@HiltAndroidApp
class WeatherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = this
        ImageLoader.initialize(this)
    }

    companion object {
        lateinit var appContext: Context
            private set
    }
}