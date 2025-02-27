package com.cb.cleanarchitecture.Presentation

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltAndroidApp
 class AppController:Application() {

    override fun onCreate() {
        super.onCreate()
    }
}