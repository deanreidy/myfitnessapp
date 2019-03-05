package com.example.myfitnessapp.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.myfitnessapp.R
import com.example.myfitnessapp.com.example.myfitnessapp.main.MainApp
import com.example.myfitnessapp.models.FitnessModel
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity(), AnkoLogger {

    var MyFitnessApp = FitnessModel()
    val classes = ArrayList<FitnessModel>()
    lateinit var  app : MainApp


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        app = application as MainApp

        info("Main Activity has now started")
        btnAdd.setOnClickListener() {
            MyFitnessApp.title = classTitle.text.toString()
            MyFitnessApp.description = description.text.toString()
            if (MyFitnessApp.title.isNotEmpty()) {
                app.classes.add(MyFitnessApp.copy())
                info("add Button Pressed: $MyFitnessApp")
                app.classes.forEach { info("add Button Pressed: ${it}")}
            }
            else {
                toast ("Please Enter a title")
        }
    }
}



}
