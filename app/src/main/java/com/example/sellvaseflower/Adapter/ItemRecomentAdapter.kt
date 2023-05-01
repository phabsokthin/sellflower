package com.example.sellvaseflower.Adapter

import android.content.Context
import android.media.Image
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.sellvaseflower.Model.RecommendModel
import com.example.sellvaseflower.R
import org.w3c.dom.Text

class ItemRecomentAdapter(private val list: MutableList<RecommendModel>, private val context: Context):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.home_item_recoment, parent, false)
        return  HomeItemRecommendViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {


        val title = holder.itemView.findViewById<TextView>(R.id.re_title1)
        title.text = list[position].title

        val price = holder.itemView.findViewById<TextView>(R.id.re_titleprice)
        price.text = list[position].price

        val iconImages = holder.itemView.findViewById<ImageView>(R.id.image_flowers)
        iconImages.setImageResource(list[position].iconsImage)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class HomeItemRecommendViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }


}