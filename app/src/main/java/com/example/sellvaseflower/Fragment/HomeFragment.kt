package com.example.sellvaseflower.Fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sellvaseflower.Adapter.HomeAdapter
import com.example.sellvaseflower.Model.HomeModel
import com.example.sellvaseflower.R

class HomeFragment:Fragment(R.layout.item_home_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val itemList = getDummyList(100)
        val adapter = HomeAdapter(itemList, requireContext())
        val recyclerView = view.findViewById<RecyclerView>(R.id.home_recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)


    }

    private fun getDummyList(size: Int):MutableList<Any>{

        val list = ArrayList<Any>()

        list.add(HomeModel.HomeSearch(1))
        list.add(HomeModel.HomeSlider(1))
        list.add(HomeModel.HomeBanner(1))
        list.add(HomeModel.HomeDiscount(1))
        list.add(HomeModel.HomeRecommend(1))
        list.add(HomeModel.HomePuppular(1))

        return list
    }
}