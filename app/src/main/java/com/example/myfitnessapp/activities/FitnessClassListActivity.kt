package com.example.myfitnessapp.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_fitness_class_list.*
import kotlinx.android.synthetic.main.activity_myfitnessapp_card.view.*
import com.example.myfitnessapp.R
import com.example.myfitnessapp.com.example.myfitnessapp.main.MainApp
import com.example.myfitnessapp.models.FitnessModel


class PlacemarkListActivity : AppCompatActivity() {

    lateinit var app: MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fitness_class_list)
        app = application as MainApp

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = PlacemarkAdapter(app.classes)
    }
}

class PlacemarkAdapter constructor(private var classes: List<FitnessModel>) : RecyclerView.Adapter<PlacemarkAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_myfitnessapp_card, parent, false))
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        val placemark = classes[holder.adapterPosition]
        holder.bind(placemark)
    }

    override fun getItemCount(): Int = classes.size

    class MainHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(placemark: FitnessModel) {
            itemView.placemarkTitle.text = placemark.title
            itemView.description.text = placemark.description
        }
    }
}