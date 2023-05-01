package com.example.sellvaseflower.Adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sellvaseflower.Model.*
import com.example.sellvaseflower.R
import com.smarteist.autoimageslider.SliderView

class HomeAdapter(private val model: MutableList<Any>, private val context: Context):RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    val bannerlist = mutableListOf<BannerModel>(

        BannerModel(1,"Love", R.drawable.heart),
        BannerModel(2, "Vases", R.drawable.vase),
        BannerModel(3, "Balloons", R.drawable.baloon),
        BannerModel(4, "Collections", R.drawable.collections),
        BannerModel(5, "Flowers", R.drawable.ic_baseline_local_florist_24),
        BannerModel(6, "Gift", R.drawable.gitf),
    )

    val discountlist = mutableListOf<DiscountModel>(

        DiscountModel(1, "Exquisite Series One\nYear Flowers","", "$23.00",R.drawable.discount2),
        DiscountModel(2, "Rose Flower Bouquet\nBlue Flowers", "Check out flower to your partner", "$50.00", R.drawable.discount3),
        DiscountModel(3, "Vase Flower for weedding\nBouquet Flowers", "With your love", "$34.00", R.drawable.discount1),

    )


    val recommendlist = mutableListOf<RecommendModel>(

        RecommendModel(1,"Chrysanthemun", "$12.99", R.drawable.re_flower),
        RecommendModel(2,"Chalathea Flower", "$22.99", R.drawable.re4),
        RecommendModel(3,"Monstera Flower", "$30.99", R.drawable.re2),
        RecommendModel(4,"Succulen Flower", "$19.99", R.drawable.re3)

    )

    val polist = mutableListOf<PoModel>(

        PoModel(1,"Terlips","$30.99",R.drawable.po1),
        PoModel(2,"Sunflower ","$33.99", R.drawable.po2),
        PoModel(3, "Sweet Rosy","$25.99",R.drawable.po3),
        PoModel(4,"Angel","$21.99",R.drawable.po4)
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return when(viewType){

            HomeModel.Home_Type.TYPE_SEARCH ->{
                var itemView = LayoutInflater.from(parent.context).inflate(R.layout.home_item_search, parent, false)
                HomeSearchViewHolder(itemView)
            }

            HomeModel.Home_Type.TYPE_SLIDER ->{
                var itemView = LayoutInflater.from(parent.context).inflate(R.layout.home_item_slider, parent, false)
                HomeSliderViewHolder(itemView)
            }

            HomeModel.Home_Type.TYPE_BANNER ->{
                var itemView = LayoutInflater.from(parent.context).inflate(R.layout.home_item_banner_recyclerview, parent, false)
                HomeBannerViewHolder(itemView)
            }

            HomeModel.Home_Type.TYPE_DISCOUNT ->{
                var itemView = LayoutInflater.from(parent.context).inflate(R.layout.home_item_discount_recyclerview, parent, false)
                HomeDiscountViewHolder(itemView)
            }
            HomeModel.Home_Type.TYPE_RECOMEND ->{
                var itemView = LayoutInflater.from(parent.context).inflate(R.layout.home_item_recommend_recyclerview, parent, false)
                HomeRecommendViewHolder(itemView)
            }

            HomeModel.Home_Type.TYPE_PUPPULAR ->{

                var itemView = LayoutInflater.from(parent.context).inflate(R.layout.home_item_pupular_recyclerview, parent, false)
                HomePopularViewHolder(itemView)
            }
            else ->{
                val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
                HomeSliderViewHolder(itemView)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if(getItemViewType(position) == HomeModel.Home_Type.TYPE_SEARCH){

        }else if (getItemViewType(position) == HomeModel.Home_Type.TYPE_SLIDER){

            val imglist : MutableList<Int> = mutableListOf(

                R.drawable.slider1,
                R.drawable.slider2,
                R.drawable.slider4
            )

            val sliderAdapter = ImageSliderAdapter(imglist)
            val itemView = (holder as HomeSliderViewHolder)

            itemView.rvSlider.setSliderAdapter(sliderAdapter)
            itemView.rvSlider.isAutoCycle = true
            itemView.rvSlider.scrollTimeInSec = 7
            itemView.rvSlider.startAutoCycle()

        }else if (getItemViewType(position) == HomeModel.Home_Type.TYPE_BANNER){

            var itemView = (holder as HomeBannerViewHolder)
            itemView.homebanner.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, true)

            itemView.homebanner.adapter = ItemBannerAdapter(list = bannerlist,context)
            itemView.homebanner.setHasFixedSize(true)


        }else if (getItemViewType(position) == HomeModel.Home_Type.TYPE_DISCOUNT){

            var itemView = (holder as HomeDiscountViewHolder)
            itemView.homediscount.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, true)

            itemView.homediscount.adapter = ItemDiscountAdapter(list = discountlist,context)
            itemView.homediscount.setHasFixedSize(true)

        }else if (getItemViewType(position) == HomeModel.Home_Type.TYPE_RECOMEND){

            var itemView = (holder as HomeRecommendViewHolder)
            itemView.homerecommend.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, true)

            itemView.homerecommend.adapter = ItemRecomentAdapter(list = recommendlist, context)
            itemView.homerecommend.setHasFixedSize(true)

        }else if (getItemViewType(position) == HomeModel.Home_Type.TYPE_PUPPULAR){

            var itemView = (holder as HomePopularViewHolder)
            itemView.homePuppular.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, true)

            itemView.homePuppular.adapter = ItemPopular(list = polist, context)
            itemView.homePuppular.setHasFixedSize(true)

        }

    }

    override fun getItemViewType(position: Int): Int {

        if (model[position] is HomeModel.HomeSearch){
            return HomeModel.Home_Type.TYPE_SEARCH
        }else if (model[position] is HomeModel.HomeSlider){
            return HomeModel.Home_Type.TYPE_SLIDER
        }else if (model[position] is HomeModel.HomeBanner){
            return HomeModel.Home_Type.TYPE_BANNER
        }else if (model[position] is HomeModel.HomeDiscount){
            return HomeModel.Home_Type.TYPE_DISCOUNT
        }else if (model[position] is HomeModel.HomeRecommend){
            return HomeModel.Home_Type.TYPE_RECOMEND
        }else if (model[position] is HomeModel.HomePuppular){
            return HomeModel.Home_Type.TYPE_PUPPULAR
        }

        return super.getItemViewType(position)
    }


    override fun getItemCount(): Int = model.size


    inner class HomeSearchViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }
    inner class HomeSliderViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val rvSlider:SliderView = itemView.findViewById(R.id.img_slide)
    }
    inner class HomeBannerViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val homebanner:RecyclerView = itemView.findViewById(R.id.item_home_banner_recyclerview)
    }
    inner class HomeDiscountViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val homediscount:RecyclerView = itemView.findViewById(R.id.home_item_discount_recyclerview)
    }

    inner class HomeRecommendViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val homerecommend:RecyclerView = itemView.findViewById(R.id.home_item_recommend_recyclerview)
    }
    inner class HomePopularViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val homePuppular:RecyclerView = itemView.findViewById(R.id.item_popular_recyclerview)
    }
}