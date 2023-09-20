package com.example.belajarandroidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.model.Doa
import com.example.myprojectactivity.R

class DoaAdapter(val data: ArrayList<Doa>)
    : RecyclerView.Adapter<DoaAdapter.DoaViewHolder>() {
    class DoaViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {

        val tvDoa: TextView = view.findViewById(R.id.tvDoa)
        val ivDoa: ImageView = view.findViewById(R.id.ivDoa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaAdapter.DoaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_app_ngaji,parent,false)
        return DoaViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: DoaViewHolder, position: Int) {
        val item = data.get(position)

        holder.tvDoa.text = item.name
        holder.ivDoa.setImageResource(item.image)
    }
}
