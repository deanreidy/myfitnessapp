package com.example.myfitnessapp.com.example.myfitnessapp.main

import android.app.Application
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class MainApp : Application(), AnkoLogger {

    override fun onCreate() {
        super.onCreate()
        info("Fitness app has started")
    }
}