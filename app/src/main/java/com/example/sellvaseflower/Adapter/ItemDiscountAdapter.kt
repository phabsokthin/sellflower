package com.example.sellvaseflower.Adapter

import android.content.Context
import android.media.Image
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import com.example.sellvaseflower.Model.DiscountModel
import com.example.sellvaseflower.R
import org.w3c.dom.Text

class ItemDiscountAdapter(private val list: MutableList<DiscountModel>, private val context: Context):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.home_item_discount, parent, false)
        return HomeDiscountViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {



        val discounttitle = holder.itemView.findViewById<TextView>(R.id.title_flower1)
        discounttitle.text = list[position].d_title

        val discountdescription = holder.itemView.findViewById<TextView>(R.id.title_flower2)
        discountdescription.text = list[position].d_description

        val discountprice = holder.itemView.findViewById<TextView>(R.id.title_flower3)
        discountprice.text = list[position].d_price

        val discountImage = holder.itemView.findViewById<ImageView>(R.id.discount_image_flower)
        discountImage.setImageResource(list[position].discountflower)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class HomeDiscountViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){

    }
}