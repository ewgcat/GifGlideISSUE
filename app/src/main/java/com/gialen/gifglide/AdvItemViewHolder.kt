package com.gialen.gifglide

import android.content.Context
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AdvItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var imageView: ImageView

    init {
        imageView = itemView.findViewById(R.id.imageView)
    }

    fun bindView(context: Context, url:String) {
        val width = ScreenUtil.getScreenWidth(context)-CommonUtil.dp2px(context,20f)
        val height=width/4
        var options = RequestOptions()
        options = options.override(width, height)
        options = options.transform(GlideRoundTransform())
        Glide.with(context).load(url).apply(options).into(imageView)

    }
}
