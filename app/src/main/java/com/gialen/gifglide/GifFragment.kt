package com.gialen.gifglide

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_gif.*

class GifFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_gif, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView.layoutManager= LinearLayoutManager(context)
        val indexAdapter = IndexAdapter(context!!)
        recyclerView.adapter= indexAdapter
        val arrayList = ArrayList<String>()
        arrayList.add("https://cs-jiaomigo.gialen.com/image/pic/6a/da/1579485053817.gif")
        arrayList.add("https://cs-jiaomigo.gialen.com/image/pic/6a/da/1579485053817.gif")
        indexAdapter.setIndexDataList(arrayList)
    }
}