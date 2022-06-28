package com.argedik.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.argedik.myapplication.R
import com.argedik.myapplication.models.Veri

class UserAdapter(private val list:ArrayList<Veri>):
    RecyclerView.Adapter<UserAdapter.AdapterViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return AdapterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        val currentItem = list[position]
        holder.name.text=currentItem.name
        holder.userName.text=currentItem.username
        holder.email.text=currentItem.email
    }

    override fun getItemCount(): Int {
        return list.size
    }
    class AdapterViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val name:TextView=itemView.findViewById(R.id.name)
        val userName:TextView=itemView.findViewById(R.id.username)
        val email:TextView=itemView.findViewById(R.id.email)
    }
}