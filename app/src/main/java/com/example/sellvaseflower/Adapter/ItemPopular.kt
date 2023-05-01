package com.example.sellvaseflower.Adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import com.example.sellvaseflower.Model.PoModel
import com.example.sellvaseflower.R

class ItemPopular(private val list: MutableList<PoModel>, private val context: Context):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.home_item_pupular, parent, false)
        return HomePopularViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {



        val title = holder.itemView.findViewById<TextView>(R.id.pu_title1)
        title.text = list[position].title

        val price = holder.itemView.findViewById<TextView>(R.id.pu_titleprice)
        price.text = list[position].price


        val iconsImage = holder.itemView.findViewById<ImageView>(R.id.image_flower1)
        iconsImage.setImageResource(list[position].iconsImage)

    }

    override fun getItemCount(): Int {
       return list.size
    }


    inner class HomePopularViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }


}