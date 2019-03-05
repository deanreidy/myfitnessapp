package com.example.myfitnessapp.main

import android.app.Application
import com.example.myfitnessapp.models.FitnessModel
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class MainApp : Application(), AnkoLogger {

    val classes = ArrayList<FitnessModel>()

    override fun onCreate() {
        super.onCreate()
        info("Fitness app has started")
        classes.add(FitnessModel("One", "About one..."))
        classes.add(FitnessModel("Two", "About two..."))
        classes.add(FitnessModel("Three", "About three..."))
    }
}