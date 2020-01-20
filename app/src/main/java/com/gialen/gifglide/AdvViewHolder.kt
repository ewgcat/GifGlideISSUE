package com.gialen.vip.main.index.adv

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gialen.gifglide.R
import java.util.ArrayList

class AdvViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var recyclerView: RecyclerView

    init {
        recyclerView = itemView.findViewById(R.id.recyclerView)
    }

    fun bindView(context: Context, url: String) {
        recyclerView.layoutManager=LinearLayoutManager(context)
        val advAdapter = IndexAdvAdapter(context)
        recyclerView.adapter= advAdapter
        var list=ArrayList<String>()
        list.add(url)
        advAdapter.setList(list)
    }
}
