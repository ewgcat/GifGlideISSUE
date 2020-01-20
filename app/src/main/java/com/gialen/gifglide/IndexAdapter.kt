package com.gialen.gifglide

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager

import com.gialen.vip.main.index.adv.AdvViewHolder

import java.util.ArrayList

class IndexAdapter(private val context: Context ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    //轮播图


    //图文导航
    private var indexDataList: ArrayList<String>

    init {
        indexDataList = ArrayList<String>()
    }





    fun setIndexDataList(indexDataList: ArrayList<String>) {
        this.indexDataList.clear()
        this.indexDataList.addAll(indexDataList)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

            val view = inflate(parent, R.layout.view_item_index_adv)
            return AdvViewHolder(view)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

            val advViewHolder = holder as AdvViewHolder
            advViewHolder.bindView(context,indexDataList!![position])

    }

    override fun getItemCount(): Int {
        return indexDataList!!.size
    }

    private fun inflate(parent: ViewGroup, layoutRes: Int): View {
        return LayoutInflater.from(parent.context).inflate(layoutRes, parent, false)
    }



}
