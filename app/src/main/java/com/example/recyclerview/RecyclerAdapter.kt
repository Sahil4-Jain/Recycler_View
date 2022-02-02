package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private var userList : ArrayList<User> = ArrayList()

    constructor(userList : ArrayList<User>){
         this.userList = userList
    }

    class ViewHolder : RecyclerView.ViewHolder{
        var txt : TextView? = null
        constructor(view : View) : super(view) {
              txt = view.findViewById(R.id.textview_name)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var item = LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var naam = userList.get(position).name
        holder.txt!!.text = naam
    }

    override fun getItemCount(): Int {
        return userList.size
    }

}