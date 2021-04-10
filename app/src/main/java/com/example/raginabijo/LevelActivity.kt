package com.example.raginabijo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LevelActivity : AppCompatActivity() {
    lateinit var levelList : ArrayList<String>
    lateinit var adapter: CustomAdapter
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)
        recyclerView = findViewById(R.id.recyclerView)
        levelList = ArrayList()
        levelList.add("ლეველი 1")
        levelList.add("ლეველი 2")
        levelList.add("ლეველი 3")
        levelList.add("ლეველი 4")
        levelList.add("ლეველი 5")

        recyclerView.layoutManager = LinearLayoutManager(this);

        adapter = CustomAdapter(levelList, this)

        recyclerView.adapter = adapter







    }
}