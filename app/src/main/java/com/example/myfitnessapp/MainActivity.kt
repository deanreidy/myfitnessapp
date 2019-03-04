package com.example.myfitnessapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.myfitnessapp.models.FitnessModel
import kotlinx.android.synthetic.main.activity_fitness.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity(), AnkoLogger {

    var MyFitnessApp = FitnessModel()
    val classes = ArrayList<FitnessModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        info("Main Activity has now started")
        btnAdd.setOnClickListener() {
            MyFitnessApp.title = classTitle.text.toString()
            MyFitnessApp.description = description.text.toString()
            if (MyFitnessApp.title.isNotEmpty()) {
                classes.add(MyFitnessApp.copy())
                info("add Button Pressed: $MyFitnessApp")
                classes.forEach { info("add Button Pressed: ${it.title}")}
            }
            else {
                toast ("Please Enter a title")
        }
    }
}



}
