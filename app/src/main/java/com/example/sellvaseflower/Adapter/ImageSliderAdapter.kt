package com.example.sellvaseflower.Adapter

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import com.google.android.material.slider.Slider
import com.smarteist.autoimageslider.SliderView
import com.smarteist.autoimageslider.SliderViewAdapter
import android.view.LayoutInflater
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.sellvaseflower.R

class ImageSliderAdapter(private val imglist: MutableList<Int>):SliderViewAdapter<ImageSliderAdapter.SliderViewHolder>() {


    override fun getCount(): Int = imglist.size

    override fun onCreateViewHolder(parent: ViewGroup?): SliderViewHolder {
        var itemView = LayoutInflater.from(parent?.context).inflate(R.layout.img_slider, parent, false)
        return SliderViewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: SliderViewHolder?, position: Int) {
        if (viewHolder !=null){
            Glide.with(viewHolder.itemView).load(imglist.get(position)).fitCenter().into(viewHolder.imageView)
        }
    }

    class  SliderViewHolder(itemView: View):ViewHolder(itemView){

        val imageView: ImageView = itemView.findViewById(R.id.img_slider)
    }

}