package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    var array : ArrayList<User> = ArrayList()
    var recycler : RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler = findViewById(R.id.recyclerView1)

        setUser()
        setAdapter()
    }

    private fun setAdapter(){
        var recycle = RecyclerAdapter(array)
        var layout : RecyclerView.LayoutManager = LinearLayoutManager(applicationContext)
        recycler!!.layoutManager = layout
        recycler!!.itemAnimator = DefaultItemAnimator()
        recycler!!.adapter = recycle
    }

    private fun setUser(){
        for(i in 1..40)
          array.add(User(""+(123*i)))
    }
}