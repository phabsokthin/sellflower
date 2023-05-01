package com.example.sellvaseflower.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sellvaseflower.Model.BannerModel
import com.example.sellvaseflower.R


// before you commect from banner you must chang Any to BannerModel
class ItemBannerAdapter(private val list: MutableList<BannerModel>, private val context: Context):RecyclerView.Adapter<RecyclerView.ViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {


        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.home_item_banner, parent, false)
        return HomeBannerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {



        val names = holder.itemView.findViewById<TextView>(R.id.title_gift)
        names.text = list[position].names

        val icons = holder.itemView.findViewById<ImageView>(R.id.icons)
        icons.setImageResource(list[position].icon)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class HomeBannerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    }
}