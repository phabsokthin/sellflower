package com.example.sellvaseflower.Model

object HomeModel{

    data class HomeModel(var title: String, var sub_title: String)

    object Home_Type{

        val TYPE_SEARCH = 1
        val TYPE_SLIDER = 2
        val TYPE_BANNER = 3
        val TYPE_DISCOUNT = 4
        val TYPE_RECOMEND = 5
        val TYPE_PUPPULAR = 6
    }

    data class HomeSearch (var id: Int)
    data class HomeSlider (var  id: Int)
    data class HomeBanner (var id: Int)
    data class HomeDiscount (var id: Int)
    data class HomeRecommend (var id: Int)
    data class HomePuppular(var id: Int)

}